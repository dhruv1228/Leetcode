public class Solution
{
    public int LongestSubsequence(int[] nums)
    {
        int xor = 0;

        foreach (int num in nums)
        {
            xor ^= num;
        }

        if (xor != 0)
            return nums.Length;

        foreach (int num in nums)
        {
            if (num != 0)
                return nums.Length - 1;
        }

        return 0;
    }
}
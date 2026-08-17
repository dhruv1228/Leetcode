public class Solution {
    public int MaxSubArray(int[] nums) {
        int max=int.MinValue;
        int sum=0;
        for(int i=0;i<nums.Length;i++){
            sum+=nums[i];
            max=Math.Max(sum,max);
            if(sum<0) sum=0;
        }
        return max;
    }
}
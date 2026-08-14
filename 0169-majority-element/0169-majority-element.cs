public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int,int> map=new Dictionary<int,int>();
        foreach(int num in nums){
            map[num]=map.GetValueOrDefault(num,0)+1;
        }
        foreach(int num in nums){
            if(map[num]>nums.Length/2) return num;
        }
        return -1;
    }
}
public class Solution {
    int fun(int[] nums,int low,int high,int target){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target){
            return fun(nums,mid+1,high,target);
        }
        else{
            return fun(nums,low,mid-1,target);
        }
    }
    public int Search(int[] nums, int target) {
        return fun(nums,0,nums.Length-1,target);
    }
}
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] nums=new int[1001];
        for(int num:arr){
            nums[num]++;
        }
        int count=0;
        for(int i=1;i<1001;i++){
            if(nums[i]==0){
                count++;
                if(count==k){
                    return i;
                }
            }
            if(i==1000){
                return 1000+(k-count);
            }
        }
        return 0;
    }
}
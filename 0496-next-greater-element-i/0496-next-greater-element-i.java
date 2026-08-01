class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        int x=0;
        boolean insert;
        boolean found=false;
        for(int i=0;i<nums1.length;i++){
            insert = false;
            found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !found){
                    found=true;
                }
                else if(found){
                    if(nums1[i]<nums2[j]){
                        arr[x++]=nums2[j];
                        insert=true;
                        break;
                    }
                }
            }
            if(!insert){
                arr[x++]=-1;
            }
        }
        return arr;
        
    }
}
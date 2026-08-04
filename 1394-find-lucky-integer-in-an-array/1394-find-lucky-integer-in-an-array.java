class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int lucky=0;
        int maxLucky=-1;
        int count=1;
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==curr){
                count++;
                if(i==arr.length-1 && count==arr[i]){
                    lucky=arr[i];
                    maxLucky=Math.max(maxLucky,lucky);
                }
            }
            else{
                if(count==arr[i-1]){
                    lucky=arr[i-1];
                    maxLucky=Math.max(maxLucky,lucky);
                }
                count=1;
                curr=arr[i];
            }
        }
        return maxLucky;
    }
}
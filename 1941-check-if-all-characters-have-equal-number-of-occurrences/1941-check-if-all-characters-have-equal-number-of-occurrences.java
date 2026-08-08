class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[27];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        int count=0;
        for(int i : arr){
            if(i!=0) count=i;
        }
        for(int i : arr){
            if(i!=0 && i!=count) return false;
        }
        return true;
    }
}
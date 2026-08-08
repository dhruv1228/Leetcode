class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String max=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            if(odd.length()>max.length()) max=odd;
            if(even.length()>max.length()) max=even;
        }
        return max;
        
    }
    String expand(String s, int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
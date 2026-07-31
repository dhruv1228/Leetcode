class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                char c=Character.toLowerCase(ch);
                st+=c;
            }
        }
        int left=0,right=st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
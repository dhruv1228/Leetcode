class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String str="";
        while(i<word1.length() && j<word2.length()){
            str=str+word1.charAt(i++)+word2.charAt(j++);
        }
        if(i==word1.length()){
            str=str+word2.substring(j,word2.length());
        }
        else if(j==word2.length()){
            str=str+word1.substring(i,word1.length());
        }
        return str;
        
    }
}
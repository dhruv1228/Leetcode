class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int min=Math.min(word1.length(),word2.length());
        for(int i=0;i<min;i++){
            str.append(word1.charAt(i)).append(word2.charAt(i));
        }
        str.append(word1.substring(min)).append(word2.substring(min));
        return str.toString();
    }
}
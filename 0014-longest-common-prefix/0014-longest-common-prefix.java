class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String str="";
        int min=Integer.MAX_VALUE;
        for(String s : strs){
            if(s.length()<min) min=s.length();
        }
        for(int i=0;i<min;i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    return str;
                }
            }
            str+=ch;
        }
        return str;
    }
}
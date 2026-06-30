class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        Boolean[] dp=new Boolean[s.length()];
        return fun(0,s,set,dp);
    }
    boolean fun(int i,String s,HashSet<String> set,Boolean[] dp){
        if(i==s.length()) return true;
        if(dp[i]!=null) return dp[i];
        for(int j=i;j<s.length();j++)
        {
            String word=s.substring(i,j+1);
            if(set.contains(word)){
                boolean other=fun(j+1,s,set,dp);
                if(other){
                    return true;
                }
            }
        }
        return dp[i]=false;
    }
}
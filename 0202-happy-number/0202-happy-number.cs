public class Solution {
    public bool IsHappy(int n) {
        HashSet<int> set=new HashSet<int>();
        while(n!=1){
            if(set.Contains(n)) return false;
            set.Add(n);
            int ans=0;
            while(n>0){
                int rem=n%10;
                ans+=rem*rem;
                n/=10;
            }
            n=ans;
        }
        return true;
    }
}
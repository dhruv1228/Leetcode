class Solution {
    public long sumAndMultiply(int n) {
        long temp=n;
        long num=0,sum=0;
        while(temp>0){
            long digit=temp%10;
            if(digit!=0) num=(num*10)+digit;
            sum+=digit;
            temp/=10;
        }
        temp=num;
        long num1=0;
        while(temp>0){
        long digit=temp%10;
            num1=(num1*10)+digit;
            temp/=10;
        }
        return num1*sum;
    }
}
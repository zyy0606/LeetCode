public class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        if(n<10){
            if(n==1||n==7) return true;
            else return false;
        }
        int sum=0;
        while(n>0){
            int tmp=n%10;
            n=n/10;
            sum+=tmp*tmp;
        }
        return isHappy(sum);
    }
}
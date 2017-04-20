public class Solution {
    public int findNthDigit(int n) {
        int i=1;
        int min=1;
        int max=9;
        while(max<n){
            ++i;
            min=max+1;
            max+=9*Math.pow(10,i-1)*i;
        }
        int number=(n-min)/i+(int)Math.pow(10,i-1);
        int j=1;
        while(j++<i-((n-min)%i)){
            number/=10;
        }
        return number%10;
    }
}
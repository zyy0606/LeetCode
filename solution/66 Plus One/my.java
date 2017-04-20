public class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry=false;
        int len=digits.length-1;
        digits[len]++;
        if(digits[len]==10){
            digits[len]=0;
            carry=true;
        }
        int i=len-1;
        while(carry&&i>=0){
            digits[i]++;
            if(digits[i]==10){
                digits[i]=0;
                carry=true;
            }
            else carry=false;
            i--;
        }
        if(!carry) return digits;
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
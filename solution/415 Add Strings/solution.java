public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder("");
        int l1=num1.length();
        int l2=num2.length();
        int carry=0;
        for(int i=0;i<l1||i<l2;i++){
            int a1=i<l1?num1.charAt(l1-i-1)-'0':0;
            int a2=i<l2?num2.charAt(l2-i-1)-'0':0;
            int tmp=a1+a2+carry;
            if(tmp%10!=0) result.append(tmp%10);
            else result.append("0");
            carry=tmp/10;
        }
        if(carry!=0) result.append(carry);
        return result.reverse().toString();
    }
}
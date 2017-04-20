public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder("");
        int al=a.length();
        int bl=b.length();
        String longer=al>bl?a:b;
        String shorter=al>bl?b:a;
        int carry=0;
        int i=shorter.length()-1;
        int j=longer.length()-1;
        while(i>=0){
            int tmp=shorter.charAt(i--)+longer.charAt(j--)-2*'0'+carry;
            if(tmp>=2){
                res.append(tmp-2);
                carry=1;
            }
            else{
                res.append(tmp);
                carry=0;
            }
        }
        while(j>=0){
            int tmp=longer.charAt(j--)-'0'+carry;
            if(tmp>=2){
                res.append(tmp-2);
                carry=1;
            }
            else{
                res.append(tmp);
                carry=0;
            }
        }
        if(carry==1) res.append("1");
        return res.reverse().toString();
    }
}
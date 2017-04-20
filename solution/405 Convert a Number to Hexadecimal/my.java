public class Solution {
    public String toHex(int num) {
       if(num==0) return "0";
        String[] hex={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        StringBuilder result=new StringBuilder("");
        long tmp=(long)num;
        if(tmp<0) tmp+=Math.pow(16,8);
        while(tmp>0){
            result.append(hex[(int)(tmp%16)]);
            tmp=tmp/16;
        }
        return result.reverse().toString();
    }
}
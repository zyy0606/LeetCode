public class Solution {
    public String countAndSay(int n) {
        String result="1";
        while(--n>0){
            result=say(result);
        }
        return result;
    }
    private String say(String s){
        StringBuilder res=new StringBuilder("");
        int count=1;
        int num=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==num) count++;
            else{
                res.append(count);
                res.append(num-'0');
                count=1;
                num=s.charAt(i);
            }
        }
        res.append(count);
        res.append(num-'0');
        return res.toString();
    }
}
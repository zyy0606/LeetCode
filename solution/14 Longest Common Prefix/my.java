public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String res=strs[0];
        for(String s:strs){
            if(s.equals("")) return "";
            for(int i=0;i<res.length()&&i<s.length();i++){
                if(res.charAt(i)!=s.charAt(i)){
                        res=res.substring(0,i);
                        continue;
                }
                if(i==s.length()-1) res=s;
            }
        }
        return res;
    }
}
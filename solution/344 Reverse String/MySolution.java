public class Solution {
    public String reverseString(String s) {
        StringBuilder rs = new StringBuilder("");
        char tmp;

        for(int i=s.length()-1;i>=0 ;i--){
            tmp = s.charAt(i);
            rs.append(tmp);
        }
        return rs.toString();
    }
}
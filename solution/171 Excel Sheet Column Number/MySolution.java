public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i=0; i<s.length();i++){
            char tmp=s.charAt(i);
            result=result*26+tmp-'A'+1;
        }
        return result;
    }
}
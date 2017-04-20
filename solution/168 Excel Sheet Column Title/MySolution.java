public class Solution {
    public String convertToTitle(int n) {
        String result;
        char ch;
        if(n<=26){
            ch = (char)(n+'A'-1);
            return Character.toString(ch);
        }
        else{
            ch=(char)((n-1)%26+'A');
            result = convertToTitle((n-1)/26)+Character.toString(ch);
            return result;
        } 
    }
}
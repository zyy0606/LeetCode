public class Solution {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int halfLength = s.length() / 2;
        char temp;
        for (int i = 0; i < halfLength; i++) {
            temp = ch[s.length() - 1 - i];
            ch[s.length() - 1 - i] = ch[i];
            ch[i] = temp;
        }
        return new String(ch);
    }
}




public class Solution {
    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
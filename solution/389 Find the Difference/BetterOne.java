public class Solution {
    public char findTheDifference(String s, String t) {
        char tmp = 0x00;  
            for(int i=0;i<s.length();i++)  
                tmp =(char)( tmp ^ s.charAt(i));  
            for(int i=0;i<t.length();i++)  
                tmp = (char)(tmp ^ t.charAt(i));  
            return tmp;  
    }
}


public class Solution2 {
    public char findTheDifference(String s, String t) {
        int ret = 0;
    for (int i = 0; i < s.length(); i++) {
        ret -= (int)s.charAt(i);
    }
    for (int i = 0; i < t.length(); i++) {
        ret += (int)t.charAt(i);
    }
    return (char)ret;
    }
}
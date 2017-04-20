public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        char res=0;
        for(int i=0;i<cs.length;i++){
            if(cs[i]!=ct[i]) return false;
        }
        return true;
    }
}
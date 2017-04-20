public class Solution {
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        int Length = s.length();
        
        for(int i=0;i<Length;i++)
            if(cs[i] !=ct[i]) return ct[i];
        return ct[Length];
    }
}
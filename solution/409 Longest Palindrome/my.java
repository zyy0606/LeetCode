public class Solution {
    public int longestPalindrome(String s) {
        int ss[] = new int[52];
        int index=0;
        for(int i=0;i<s.length();i++){
            int tmp=s.charAt(i);
            if(tmp<'a') index=tmp-'A';
            else index=tmp-'a'+26;
            ss[index] ^= 0x01;
        }
        int sum=0;
        for(int i=0;i<52;i++){
            sum+=ss[i];
        }
        if(sum!=0) return s.length()-sum+1;
        else return s.length();
    }
}
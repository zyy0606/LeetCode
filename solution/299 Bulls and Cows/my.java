public class Solution {
    public String getHint(String secret, String guess) {
        int A=0;
        int B=0;
        int len=secret.length();
        int[] numS=new int[10];
        int[] numG=new int[10];
        for(int i=0;i<len;i++){
            if(secret.charAt(i)==guess.charAt(i)) A++;
            numS[secret.charAt(i)-'0']++;
            numG[guess.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
        	B+=Math.min(numS[i],numG[i]);
        }
        B-=A;
        return A+"A"+B+"B";
    }
}
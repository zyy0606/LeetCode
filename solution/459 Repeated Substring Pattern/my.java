public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len=str.length();
        for(int i=1;i<len;i++){
            if(str.charAt(i)==str.charAt(0)&&len%i==0){
                int i2=0;
                for(int j=i;j<len;j++){
                    if(str.charAt(i2)!=str.charAt(j)) break;
                    i2++;
                }
                if(i2==len-i) return true;
            }
        }
        return false;
    }
}
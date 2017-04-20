public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] cr = ransomNote.toCharArray();
        char[] cm = magazine.toCharArray();
        Arrays.sort(cr);
        Arrays.sort(cm);
        int i=0,j=0;
        
        if(cr.length > cm.length) return false;
        
        while(i<cr.length && j<cm.length){
            if(cr[i] < cm[i]) return false;
            else if(cr[i] == cm[j]) {i++; j++;}
            else j++;
        }
        if(i==cr.length) return true;
        else return false;
    }
}
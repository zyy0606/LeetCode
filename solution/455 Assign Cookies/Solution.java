public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int Lg = g.length;
        int Ls = s.length; 
        int gIndex = 0;
        int sIndex = 0;
        int number = 0;
        
        while(gIndex<Lg && sIndex<Ls){
            if(g[gIndex] <= s[sIndex]){
                number ++;
                gIndex++;
                sIndex++;
            }
            else sIndex++;
        }
        return number;
    }
}
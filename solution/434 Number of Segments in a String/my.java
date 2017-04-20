public class Solution {
    public int countSegments(String s) {
        if(s.length()==0) return 0;
        int count=0;
        boolean blank=false;
        if(s.charAt(0)!=' ') count++;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') blank=true;
            else if(blank==true){
                count++;
                blank=false;
            }
        }
        return count;
    }
}
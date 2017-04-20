public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<Integer>();
        char[] chp=p.toCharArray();
        Arrays.sort(chp);
        int lenp=p.length();
        int lens=s.length();
        for(int i=0;i<=lens-lenp;i++){
            String tmp=s.substring(i,i+lenp);
            char[] chtmp=tmp.toCharArray();
            Arrays.sort(chtmp);
            boolean ana=true;
            for(int j=0;j<lenp;j++){
                if(chtmp[j]!=chp[j]){
                    ana=false;
                    break;
                }
            }
            if(ana) res.add(i);
        }
        return res;
    }
}
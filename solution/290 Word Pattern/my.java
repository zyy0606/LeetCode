public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        if(pattern.length()!=strs.length) return false;
        Map<Character,String> map=new HashMap<Character,String>();
        Set<String> set=new HashSet<String>();
        for(int i=0;i<pattern.length();i++){
            String tmp=map.get(pattern.charAt(i));
            char chp=pattern.charAt(i);
            String s=strs[i];
            if(tmp==null){
                map.put(chp,s);
                if(set.add(s)==false) return false;
            }
            else if(!tmp.equals(s)) return false;;
        }
        return true;
    }
}
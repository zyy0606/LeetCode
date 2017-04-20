public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> map=new HashMap<Character,Character>();
        Set<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            Character tmp=map.get(s.charAt(i));
            char chs=s.charAt(i);
            char cht=t.charAt(i);
            if(tmp==null){
                map.put(chs,cht);
                if(set.add(cht)==false) return false;
            }
            else if(tmp!=cht) return false;
        }
        return true;
    }
}
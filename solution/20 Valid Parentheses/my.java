public class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        if(s.length()==0) return true;
        if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') return false;
        char[] ch=new char[s.length()/2+1];
        int j=0;
        for(int i=0;i<s.length();i++){
            char tmp=s.charAt(i);
            if(tmp=='('||tmp=='['||tmp=='{') ch[j++]=tmp;
            else{
                if(ch[j---1]!=tmp-1&&ch[j]!=tmp-2) return false;
            } 
        }
        return j==0;
    }
}
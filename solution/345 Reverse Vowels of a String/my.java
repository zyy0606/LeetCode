public class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int hIndex=0;
        int tIndex=ch.length-1;
        while(hIndex<tIndex){
            while(ch[hIndex]!='a'&&ch[hIndex]!='e'&&ch[hIndex]!='i'&&ch[hIndex]!='o'&&ch[hIndex]!='u'&&ch[hIndex]!='A'&&ch[hIndex]!='E'&&ch[hIndex]!='I'&&ch[hIndex]!='O'&&ch[hIndex]!='U'&&hIndex<tIndex) hIndex++;
            while(ch[tIndex]!='a'&&ch[tIndex]!='e'&&ch[tIndex]!='i'&&ch[tIndex]!='o'&&ch[tIndex]!='u'&&ch[tIndex]!='A'&&ch[tIndex]!='E'&&ch[tIndex]!='I'&&ch[tIndex]!='O'&&ch[tIndex]!='U'&&tIndex>hIndex) tIndex--;
            if(hIndex<tIndex){
                char tmp=ch[hIndex];
                ch[hIndex]=ch[tIndex];
                ch[tIndex]=tmp;
            }
            hIndex++;
            tIndex--;
        }
        return String.valueOf(ch);
    }
}
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] table = new int[26];
        // 记录字母在第一个单词中出现的次数
        for(int i = 0; i < s.length(); i++){
            table[s.charAt(i)-'a']++;
        }
        // 减去字母在第二个单词中出现的次数
        for(int i = 0; i < t.length(); i++){
            table[t.charAt(i)-'a']--;
        }
        // 如果某个计数器不为0，则返回假
        for(int i = 0; i < 26; i++){
            if(table[i]!=0) return false;
        }
        return true;
    }
}
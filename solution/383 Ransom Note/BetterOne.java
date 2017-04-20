public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1 = ransomNote.length();  
        int len2 = magazine.length();  
        /*Step1:首先判断特殊情况，如果ransomNote的长度大于magazine的长度，则返回false*/  
        if(len1 > len2){  
            return false;  
        }  
        /*Step2:统计magazine中各个字符出现的次数；*/  
        int[] Num = new int[26];  
        for(int i =0;i<len2;i++){  
            Num[magazine.charAt(i)-97]++;  
        }  
        /*Step3:依次读ransomNote中的字母i，同时让Num[i-67]--，如果变为负数，则返回false；*/  
        for(int i =0;i<len1;i++){  
            Num[ransomNote.charAt(i)-97]--;  
            if(Num[ransomNote.charAt(i)-97]<0){  
                return false;  
            }  
        }  
        /*Step4:如果可以读完ransomNote的所有字母，走到这一步则说明Num数组中各个元素都大于等于0，返回true。*/  
        return true;  
    }
}
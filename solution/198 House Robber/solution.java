public class Solution {
    public int rob(int[] nums) {
        int preNo=0;
        int preYes=0;
        for(int n:nums){
            int tmp=preNo;
            preNo=Math.max(preNo,preYes);
            preYes=n+tmp;
        }
        return Math.max(preYes,preNo);
    }
}
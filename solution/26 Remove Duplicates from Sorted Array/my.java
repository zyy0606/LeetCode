public class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len<2) return len;
        int res=len;
        int a=nums[len-1]+1;
        int tmp=nums[0];
        for(int i=1;i<len;i++){
            if(nums[i]==tmp){
                nums[i]=a;
                res--;
            }
            else tmp=nums[i];
        }
        Arrays.sort(nums);
        return res;
    }
}
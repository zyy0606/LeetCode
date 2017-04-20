public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1) return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){  
            if(nums[i+1]==nums[i]) return true;
        }
        return false;
    }
}
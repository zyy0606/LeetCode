public class Solution {
    public int removeElement(int[] nums, int val) {
        int tIndex=nums.length;
        for(int i=0;i<tIndex;i++){
            if(nums[i]==val)
                nums[i--]=nums[tIndex-- -1];
        }
        return tIndex;
    }
}
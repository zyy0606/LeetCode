public class Solution {
    public int thirdMax(int[] nums) {
        //if(nums.length==0) return 0;
        Arrays.sort(nums);
        int i=1;
        int tmp=nums[nums.length-1];
        int j=nums.length-1;
        while(i<3&&j>=0){
            if(nums[j]<tmp){
                i++;
                tmp=nums[j];
            }
            j--;
        }
        if(i<3) return nums[nums.length-1];
        return tmp;
    }
}
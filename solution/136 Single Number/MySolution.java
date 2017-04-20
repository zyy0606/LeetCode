public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int Length = nums.length;
        if(Length < 3) return nums[0];
        else{
          for(int i=0;i<Length-1;i++)
            if(nums[i] != nums[i+1])  return nums[i];
            else i++;
          return nums[Length-1];
        }
    }
}
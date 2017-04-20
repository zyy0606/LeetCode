public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length;i++){
           result = result^nums[i];
        }
        return result;
    }
}

//这里运用到异或的性质：对于任何数x，都有x^x=0，x^0=x
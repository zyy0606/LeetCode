public class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && index<i){
                nums[index] = nums[i];
                nums[i] = 0;
                index++;
            }
            else if(nums[i]!=0 && index==i)
            index ++;
        }
    }
}

//index：指向数组中的第一个0。
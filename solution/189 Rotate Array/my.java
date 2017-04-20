public class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        int[] tmp=new int[k];
        for(int i=0;i<k;i++){
            tmp[i]=nums[len-k+i];
        }
        for(int i=len-1;i>=k;i--){
            nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i]=tmp[i];
        }
    }
}
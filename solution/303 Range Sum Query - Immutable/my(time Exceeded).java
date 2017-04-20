public class NumArray {
    List<Integer> list=new ArrayList<>();
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
    }
    
    public int sumRange(int i, int j) {
        int sum=0;
        for(int index=i;index<=j;index++){
            sum+=list.get(index);
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
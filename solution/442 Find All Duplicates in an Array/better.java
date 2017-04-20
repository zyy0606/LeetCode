public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums.length <= 1) return res;
        
        for (int i = 0; i < nums.length; i++) {
            int next = Math.abs(nums[i]) - 1;
            if (nums[next] < 0) res.add(next+1);
            else nums[next] = -nums[next];
        }
        
        return res;
    }
}
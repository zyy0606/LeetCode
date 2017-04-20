public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<Integer>();
        if(nums.length==0) return res;
        Arrays.sort(nums);
        int i=1;
        while(i<nums[0]) res.add(i++);
        for(int j=0;j<nums.length-1;j++){
            if(nums[j+1]>nums[j]+1){
                for(int k=nums[j]+1;k<nums[j+1];k++)
                  res.add(k);
            }
        }
        for(int j=nums[nums.length-1]+1;j<=nums.length;j++) res.add(j);
        return res;
    }
}
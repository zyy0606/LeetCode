public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<Integer>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1=0;
        int index2=0;
        while(index1<nums1.length&&index2<nums2.length){
            if(nums1[index1]==nums2[index2]){
                resultList.add(nums1[index1]);
                index1++;
                index2++;
            }
            else if(nums1[index1]<nums2[index2]) index1++;
            else index2++;
        }
        int[] result=new int[resultList.size()];
        int index=0;
        for(int number:resultList)
        	result[index++] = number;
        return result;
    }
}
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<Integer>();
        res.add(1);
        if(rowIndex==0) return res;
        if(rowIndex==1){
            res.add(1);
            return res;
        }
        int pre=rowIndex;
        for(int i=2;i<rowIndex;i++){
            res.add(pre);
            pre=(int)(((long)rowIndex-i+1)*pre/i);
        }
        res.add(pre);
        res.add(1);
        return res;
    }
}
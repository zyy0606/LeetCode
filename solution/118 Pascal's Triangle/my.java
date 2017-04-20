public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(numRows<=0) return res;
        List<Integer> pre=new ArrayList<Integer>();
        pre.add(1);
        res.add(pre);
        int i=2;
        
        while(i++<=numRows){
           List<Integer> list=new ArrayList<Integer>();
           list.add(1);
           for(int j=0;j<pre.size()-1;j++){
            	list.add(pre.get(j)+pre.get(j+1));
            }
           list.add(1);
           res.add(list);
           pre=list;
        }
        return res;
    }
}
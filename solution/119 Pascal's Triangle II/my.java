public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre=new ArrayList<Integer>();
        pre.add(1);
        if(rowIndex==0) return pre;
        int i=1;
        
        while(i++<=rowIndex){
           List<Integer> list=new ArrayList<Integer>();
           list.add(1);
           for(int j=0;j<pre.size()-1;j++){
            	list.add(pre.get(j)+pre.get(j+1));
            }
           list.add(1);
           pre=list;
        }
        return pre;
    }
}
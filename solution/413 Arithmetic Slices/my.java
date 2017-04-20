public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length<3) return 0;
        //int[] diff=new int[A.length-1];
        
        //for(int i=0;i<diff.length;i++) diff[i]=A[i+1]-A[i];
        int res=0;
        int count=0;
        for(int i=1;i<A.length-1;i++){
            if(A[i+1]-A[i]==A[i]-A[i-1]) count++;
            else{
                res+=count*(count+1)/2;
                count=0;
            }
        }
        res+=count*(count+1)/2;
        return res;
    }
}
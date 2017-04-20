public class Solution {
    public int maxRotateFunction(int[] A) {
        int sum=0;
        int Fn=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            sum+=A[i];
            Fn+=A[i]*i;
        }
        int result=Fn;
        for(int i=n-1;i>0;i--){
            Fn=Fn+sum-n*A[i];
            if(Fn>result) result=Fn;
        }
        return result;
    }
}
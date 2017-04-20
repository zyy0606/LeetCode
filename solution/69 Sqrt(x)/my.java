public class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int left=0;
        int right=x/2;
        if(right>Math.pow(2,15.5)) right=(int)Math.pow(2,15.5);
        while(left<right){
            if(right*right<=x) return right;
            int tmp=(left+right)/2;
            if(tmp==left) return left;
            if(tmp*tmp<x) left=tmp;
            else right=tmp;
        }
        return left;
    }
}
public class Solution {
    public int arrangeCoins(int n) {
        return (int)(4*Math.sqrt(0.125+0.5*n)-1)/2;
    }
}
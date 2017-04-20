public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 31; i++) {
        result += n & 1;
        n >>>= 1;   // CATCH: must do unsigned shift
        result <<= 1;
        }
        result += n & 1;// CATCH: for last digit, don't shift!
        return result;
    }
}
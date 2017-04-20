public class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)) count++;
        }
        return count;
    }
    
    private boolean isPrime(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0) return false;
        }
        return true;
    }
}
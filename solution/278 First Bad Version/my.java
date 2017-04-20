/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)) return 1;
        int left=1;
        int right=n;
        int tmp=(left+right)/2;
        while(!isBadVersion(left)&&isBadVersion(right)){
            if(isBadVersion(tmp)){
                right=tmp-1;
                left++;
                tmp=left+(right-left)/2;
            }
            else{
                left=tmp+1;
                right--;
                tmp=left+(right-left)/2;
            }
        }
        if(isBadVersion(left)) return left;
        return right+1;
    }
}
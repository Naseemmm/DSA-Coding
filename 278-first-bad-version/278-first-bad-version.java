/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1;
        int e=n;
        int res=n;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isBadVersion(mid)){
                res=mid;
                e=mid-1;
            }
            else 
            {
                s=mid+1;
            }
        }
        return res;
    }
}
class Solution {
    public int arrangeCoins(int n) {
      long s=0;
     long e=n;
        while(s<=e)
        {
          long mid=s+(e-s)/2;
            if(mid*(mid+1)/2==n)
            {
                return (int) mid;
            }
            else if(mid*(mid+1)/2<n)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return (int) e;
    }
}
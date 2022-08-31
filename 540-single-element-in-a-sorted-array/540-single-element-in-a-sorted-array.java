class Solution {
    public int singleNonDuplicate(int[] nums) {
     int s=0;
      int e=nums.length-1;
        int n=nums.length;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            if((mid%2==0 &&mid+1<n &&nums[mid]==nums[mid+1] )|| 
               (mid%2==1 &&mid-1>=0&&nums[mid]==nums[mid-1]))
            
                s=mid+1;
            
            else
                e=mid;
            if(mid-1>=0 &&mid+1<n &&nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
                return nums[mid];
                
        }
        return nums[s];
    }
}
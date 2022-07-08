class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=0;
        while(i<nums.length)
        {
          int j=nums[i]-1;
           if(nums[i]<=nums.length &&nums[i]>0 && nums[i]!=nums[j])
           {
              int t=nums[i];
               nums[i]=nums[j];
               nums[j]=t;
           }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
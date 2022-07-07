class Solution {
    public int missingNumber(int[] nums) {
      
       int i=0;
        while(i<nums.length)
        {
            int j=nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[j])
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
            if(nums[j]!=j)
            {
                return j;
            }
        }
       return nums.length;
    }
}
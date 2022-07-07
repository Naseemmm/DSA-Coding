class Solution {
    public int majorityElement(int[] nums) {
      int count=1;
        int m=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==m)
                count++;
            else
            {
                count--;
                if(count==0)
                {
                    m=nums[i];
                    count=1;
                }
            }
        }
        return m;
        }
}
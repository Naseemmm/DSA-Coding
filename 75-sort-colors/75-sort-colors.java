class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int mid=0;
        int h=nums.length-1;
        while(mid<=h)
        {
            switch(nums[mid])
            {
                case 0:
                    {
                        int t=nums[l];
                        nums[l]=nums[mid];
                        nums[mid]=t;
                        l++;
                        mid++;
                        break;
                    }
                case 1:
                    {
                    mid++;
                        break;
                        }
                case 2:
                    {
                        int t=nums[mid];
                        nums[mid]=nums[h];
                        nums[h]=t;
                        h--;
                    }
                
            }
        }
    }
}
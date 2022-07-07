class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int p=0;
        while(i>=2)
        {
            if(nums[i-1]+nums[i-2]>nums[i]){
             p= nums[i-1]+nums[i-2]+nums[i];
            break;}
            i--;
        }
        return p;
    }
}
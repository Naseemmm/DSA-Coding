class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        return Math.max(nums[i]*nums[i-1]*nums[i-2],nums[0]*nums[i]*nums[1]);
    }
}
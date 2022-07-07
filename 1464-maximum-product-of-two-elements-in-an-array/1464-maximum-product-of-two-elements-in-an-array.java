class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
            int i=nums.length;
            return Math.max((nums[i-1]-1)*(nums[i-2]-1),(nums[0]-1)*(nums[1]-1));
    }
}
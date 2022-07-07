class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] a=new int[nums.length];
        int counter=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                a[counter]=nums[i];
            counter++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0){
                a[counter]=nums[i];
            counter++;
            }
        }
        return a;
    }
}
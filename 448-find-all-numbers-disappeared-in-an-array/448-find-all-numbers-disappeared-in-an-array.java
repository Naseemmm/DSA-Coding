class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     int i=0;
     while(i<nums.length)
     {
         int j=nums[i]-1;
         if(nums[i]!=nums[j])
         {
             int t=nums[i];
             nums[i]=nums[j];
             nums[j]=t;
         }
         else
             i++;
     }
        List<Integer>a=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if((nums[j]-1)!=j)
                a.add(j+1);
        }
        return a;
    }
}
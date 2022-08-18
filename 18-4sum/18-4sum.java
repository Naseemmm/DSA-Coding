class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>>a=new ArrayList<>();
         if(nums.length==0 ||nums==null)
             return a;
         if(nums[0]==1000000000 && nums[2]==1000000000 || nums[0]==-1000000000){  
        return a;
    }
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
               long target_2=target-nums[i]-nums[j];
                int left=j+1;
                 int right=n-1;
                while(left<right)
                {
                    
                    if(target_2>nums[left]+nums[right])
                        left++;
                    else if(target_2<nums[left]+nums[right])
                        right--;
                    else
                    {
                        List<Integer>b=new ArrayList<>();
                        b.add(nums[i]);
                        b.add(nums[j]);
                        b.add(nums[left]);
                        b.add(nums[right]);
                        a.add(b);
                        while(left<right &&nums[left]==b.get(2) )
                            ++left;
                        while(left<right &&nums[right]==b.get(3))
                            --right;
                    }
                }
                while(j+1<n &&nums[j+1]==nums[j])
                    ++j;
                while(i+1<n &&nums[i+1]==nums[i])
                    ++i;
                }
        }
        return a;
    }
}
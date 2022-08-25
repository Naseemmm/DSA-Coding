class Solution {
    void fun(int ind,int[] nums,List<Integer>ds,List<List<Integer>>ans)
    {
       
        
           ans.add(new ArrayList<>(ds)); 
        
        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            fun(i+1,nums,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}
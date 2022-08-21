class Solution {
    void fun(int ind,int target,int[] candidates,List<List<Integer>>ans,List<Integer>ds)
    {
        if(ind==candidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<Integer>(ds));
                    
            }
            return;
        }
        if(candidates[ind]<=target)
        {
            ds.add(candidates[ind]);
            fun(ind,target-candidates[ind],candidates,ans,ds);
            ds.remove(ds.size()-1);
        }
        fun(ind+1,target,candidates,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
}
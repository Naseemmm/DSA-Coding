class Solution {
    void fun(int ind,int target,int[] candidates,List<Integer>ds,List<List<Integer>>ans)
    {
        if(ind==candidates.length)
        {
            if(target==0)
                ans.add(new ArrayList<>(ds));
            return ;
        }
        if(candidates[ind]<=target)
        {
            ds.add(candidates[ind]);
            fun(ind,target-candidates[ind],candidates,ds,ans);
            ds.remove(ds.size()-1);
        }
        fun(ind+1,target,candidates,ds,ans);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(0,target,candidates,new ArrayList<>(),ans);
        List<List<Integer>> op = new ArrayList<>();
    for(List a:ans)
    {
        op.add(a);
    }
   return op;
    }
}
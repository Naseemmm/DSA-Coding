class Solution {
    void fun(int ind,String s,List<String>ds,List<List<String>>ans)
    {
        if(ind==s.length())
        {
            ans.add(new ArrayList(ds));
            return;
        }
        for(int i=ind;i<s.length();++i)
        {
            if(isPalindrome(s,ind,i))
            {
                ds.add(s.substring(ind,i+1));
            fun(i+1,s,ds,ans);
            ds.remove(ds.size()-1);
        }
        }
    }
    boolean isPalindrome(String s,int a,int b)
    {
        while(a<=b)
        {
            if(s.charAt(a++)!=s.charAt(b--))
                return false;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        fun(0,s,new ArrayList<>(),ans);
        return ans;
    }
}
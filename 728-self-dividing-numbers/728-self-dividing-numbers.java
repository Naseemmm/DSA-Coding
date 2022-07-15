class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(selfdiv(i)==true)
            {
                a.add(i);
            }
        }
        return a;
    }
   private boolean selfdiv(int n)
    {
        int num=n;
        while(num>0)
        {
            int r=num%10;
            num/=10;
            if(r==0||n%r!=0)
            {
                return false;
            }
            
        }
        return true;
    }
}
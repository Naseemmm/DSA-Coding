class Solution {
    public boolean isPalindrome(int x) {
          int z=0;
          int r=0;
        int a=x;
        while(x>0)
        {
            r=x%10;
            z=z*10+r;
            x=x/10;
        }
        if(a==z)
            return true;
        return false;
    }
}
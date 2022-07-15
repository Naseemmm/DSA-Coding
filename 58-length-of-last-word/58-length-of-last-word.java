class Solution {
    public int lengthOfLastWord(String s) {
        int p=0;
        char [] c=s.toCharArray();
        int i=c.length-1;
         while(i>0 && c[i]==' ')
               i--;
        for(int j=i;j>=0;j--)
        {
            if(c[j]!=' ')
                p++;
             else 
                break;
            
        }
        return p;
    }
}
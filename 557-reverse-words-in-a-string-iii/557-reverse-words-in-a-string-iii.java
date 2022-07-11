class Solution {
    public String reverseWords(String s) {
        char[] c=s.toCharArray();
        int i=0;
        for(int j=0;j<c.length;j++)
        {
            if(c[j]==' ')
            {
                reverse(c,i,j-1);
                i=j+1;
              
            }
        }
        reverse(c,i,c.length-1);
        return new String(c);
    }
    public void reverse(char[] c,int i,int j)
    {
        while(i<=j)
        {
            char t=c[i];
            c[i]=c[j];
            c[j]=t;
            i++;
            j--;
        } 
    }
}
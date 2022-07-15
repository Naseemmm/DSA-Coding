class Solution {
    public String addBinary(String a, String b) {
       int i=0;
        int p=a.length();
        int q=b.length();
        int c=0;
        String z="";
        while(i<p||i<q||c!=0)
        {int x=0,y=0;
           if(i<p && (a.charAt(p-1-i)=='1'))
              x=1;
         if(i<q &&(b.charAt(q-1-i)=='1'))
             y=1;
         z=(x+y+c)%2+z;
         c=(x+y+c)/2;
         i++;
        }
        return z;
    }
}
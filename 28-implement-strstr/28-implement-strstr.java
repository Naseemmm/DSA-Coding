class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.isEmpty())
           return 0;
        for(int i=0;i<haystack.length();i++)
        {
          return (haystack.indexOf(needle.substring(0,needle.length())));
                
        }
        return -1;
    }
}
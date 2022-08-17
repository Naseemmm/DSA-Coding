class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>a=new HashMap<>();
        int len=0,l=0,r=0;
       while(r<s.length())
        {
           if(a.containsKey(s.charAt(r)))
           {
               l=Math.max(l,a.get(s.charAt(r))+1);
           }
          
               a.put(s.charAt(r),r);
               len=Math.max(len,r-l+1);
           r++;
        }
        return len;
    }
}
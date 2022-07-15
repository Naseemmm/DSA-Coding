class Solution {
    public int maxRepeating(String sequence, String word) {
       String t=word;
       int ans=0;
        while(sequence.contains(t))
        {
            t+=word;
            ans++;
        }
        return ans;
    }
}
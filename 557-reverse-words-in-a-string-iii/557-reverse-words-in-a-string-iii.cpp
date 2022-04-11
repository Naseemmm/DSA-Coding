class Solution {
public:
    string reverseWords(string s) {
       int p1=0;
        int p2=0;
        while(p1<s.size()){
            while(p2 < s.size() && s[p2] !=' ')
                p2++;
            reverse(s.begin()+p1,s.begin()+p2);
               
            p1=p2+1;
            p2=p1;
        }
        return s;
    }
};
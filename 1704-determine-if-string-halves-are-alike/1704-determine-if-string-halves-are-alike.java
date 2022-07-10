class Solution {
    public boolean halvesAreAlike(String s) {
        String Vowels="AIOUEaioue";
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());
        int a=0;
        int b=0;
        for(int i=0;i<s1.length();i++)
        {
            if(Vowels.indexOf(s1.charAt(i))>=0)
                a++;
            if(Vowels.indexOf(s2.charAt(i))>=0)
                b++;
        }
        return a==b;
    }
}
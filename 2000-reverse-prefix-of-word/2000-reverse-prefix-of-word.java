class Solution {
    public String reversePrefix(String word, char ch) {
        String word1="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                String t=word.substring(0,i+1);
                 t=new StringBuilder(t).reverse().toString();
                word1=t+word.substring(i+1,word.length());
                break;
            }
            if(word1.equals(""))
            {
                word1=word;
            }
        }
       return word1;
    }
}
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return help(word1).equals(help(word2));
    }
    private String help(String [] words){
        StringBuilder sb=new StringBuilder();
        for(String word:words)
            sb.append(word);
        return sb.toString();
    }
    }

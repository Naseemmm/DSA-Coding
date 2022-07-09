class Solution {
    public String interpret(String command) {
        String s=command.replace("()","o");
        String z=s.replace("(al)","al");
        return z;
    }
}
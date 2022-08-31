class Solution {
    public boolean isValid(String s) {
    Stack<Character> a=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='{' ||c=='(' ||c=='[')
                a.push(c);
           else
           {
               if(a.isEmpty())
                   return false;
               if(c=='}' && !a.isEmpty() && a.peek()!='{')
                   return false;
               if(c==')' && !a.isEmpty() && a.peek()!='(')
                      return false;
               if(c==']' && !a.isEmpty() && a.peek()!='[')
                   return false;
               else
                   a.pop();
           }
        }
        return a.isEmpty();
    }
}
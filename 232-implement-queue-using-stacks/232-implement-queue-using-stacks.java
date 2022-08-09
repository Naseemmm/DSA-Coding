class MyQueue {
Stack<Integer> input=new Stack<>();
Stack<Integer> out=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(out.isEmpty()){
        while(!input.isEmpty())
        {
            out.push(input.pop());
            
        }
        
        }
        return out.pop();
    }
    
    public int peek() {
        if(out.isEmpty()){
        while(!input.isEmpty())
        {
            out.push(input.pop());
            
        }
        
        }
        return out.peek();
    }
    public boolean empty() {
        return input.isEmpty()&& out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
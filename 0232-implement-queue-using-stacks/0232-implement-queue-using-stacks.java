class MyQueue {

    Stack<Integer> st;
    Stack<Integer> st1;
    public MyQueue() {
        st = new Stack<>();
        st1 = new Stack<>();
    }
    
    public void push(int x) {

        st1.push(x);
        
    }
    
    public int pop() {

        if(st.isEmpty())
        {
            while(!st1.isEmpty())
            {
                st.push(st1.pop());
            }
        }
        
        return st.pop();
    }
    
    public int peek() {
 
        if(st.isEmpty())
        {
            while(!st1.isEmpty())
            {
                st.push(st1.pop());
            }
        }
            
        return st.peek();
        
    }
    
    public boolean empty() {

        if(st.isEmpty() && st1.isEmpty()) return true;
        return false;
        
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
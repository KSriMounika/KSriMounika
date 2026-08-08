class MyStack {

   Queue<Integer> myStack;
    public MyStack() {
        myStack = new LinkedList<>();
    }
    
    public void push(int x) {
        int n = myStack.size();
        myStack.add(x);
        for(int i=0; i<n; i++)
        {
            myStack.add(myStack.remove());
        }
    }
    
    public int pop() {
      return  myStack.remove();
        
    }
    
    public int top() {

       return myStack.peek();
        
    }
    
    public boolean empty() {
        if(myStack.isEmpty()) return true;
        return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
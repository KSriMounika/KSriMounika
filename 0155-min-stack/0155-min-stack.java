class MinStack {

     Stack<Long> st = new Stack<>();
     long m = Long.MAX_VALUE;

    public MinStack() {

       
        
        
    }
    
    public void push(int value) {

        if(st.isEmpty())
        {
             m = value;
            st.push((long) value);
         
        }
        else
        {
            if(value<m)
            {
                 
                  st.push( 2L*value - m);
                  m = value;
            }
            else
            {
                st.push((long)value);
            }
        }

        
    }
    
    public void pop() {

        if(st.isEmpty())
        {
            return;
        }
        long x = st.peek();
        st.pop();
        if(x<m)
        {
          
           m = 2*m -x;
        }
        
    }
    
    public int top() {
        long y = st.peek();
        if(m<y)
        {
            return (int)y;
        }
        return (int)m;
        
       
    }
    
    public int getMin() {

        return (int)m;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
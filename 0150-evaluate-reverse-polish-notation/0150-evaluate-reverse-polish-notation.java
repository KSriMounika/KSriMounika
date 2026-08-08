class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++)
        {
            if(tokens[i].equals("+"))
            {
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }
            else if(tokens[i].equals("-"))
            {
                int a1 = st.pop();
                int b1 = st.pop();
                st.push(b1-a1);
            }
            else if(tokens[i].equals("*"))
            {
                int a2 = st.pop();
                int b2 = st.pop();
                st.push(a2*b2);
            }
            else if(tokens[i].equals("/"))
            {
                int a3 = st.pop();
                int b3 = st.pop();
                st.push(b3/a3);
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        int s=0;
        for(int val: st)
        {
            s += val;
        }
        return s;
        
    }
}
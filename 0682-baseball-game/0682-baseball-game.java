class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int s=0;
        for(int i=0; i<operations.length; i++)
        {
            if(operations[i].equals("C"))
            {
                st.pop();

            }
            else if(operations[i].equals("+"))
            {
               int a = st.get(st.size()-1);
               int b = st.get(st.size()-2);
               st.push(a+b);
               
            }
            else if(operations[i].equals("D"))
            {
                
                st.push(st.peek()*2);
            }
            else
            {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        for(int val: st)
        {
            s += val;
        }
        return s;
    }
}
// <leetcode> - Question link: https://leetcode.com/problems/min-stack/

class MinStack {
    Stack<ArrayList<Integer>> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(val);
            al.add(val);
            st.push(al);
        }
        else{
            ArrayList<Integer> al = new ArrayList<>();
            al.add(val);
            al.add(Math.min(val,st.peek().get(1)));
            st.push(al);
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().get(0);
    }
    
    public int getMin() {
        return st.peek().get(1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

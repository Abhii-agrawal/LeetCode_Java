class MyQueue {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> hp = new Stack<>();
        

    public MyQueue() {
    }
    
    public void push(int x) {
        st.add(x);
        
    }
    
    public int pop() {

        while(st.size()>1){
            hp.push(st.pop());
        }
        int front = st.pop();

        while(hp.size()>0){
            st.push(hp.pop());
        }
        return front ;
    }
    
    public int peek() {
        
        while(st.size()>1){
            hp.push(st.pop());
        }
        int front = st.peek();

        while(hp.size()>0){
            st.push(hp.pop());
        }
        return front ;
    }
        
    
    public boolean empty() {
        
        return (st.size()==0);
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
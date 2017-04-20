public class MinStack {
    Stack<Integer> mystack;
    int min=Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        mystack=new Stack<Integer>();
    }
    
    public void push(int x) {
        mystack.push(x);
        if(x<min) min=x;
    }
    
    public void pop() {
        if(min==mystack.peek()){
            mystack.pop();
            if(mystack.empty()){
                min=Integer.MAX_VALUE;
                return;
            }
            min=mystack.peek();
            Stack<Integer> tmp=new Stack<Integer>();
            while(!mystack.empty()){
                int top=mystack.peek();
                min=min<top?min:top;
                tmp.push(mystack.peek());
                mystack.pop();
            }
            while(!tmp.empty()){
                mystack.push(tmp.peek());
                tmp.pop();
            }
        }
        else mystack.pop();
    }
    
    public int top() {
        return mystack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
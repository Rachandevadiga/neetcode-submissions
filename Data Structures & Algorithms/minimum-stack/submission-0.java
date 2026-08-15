class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minstack = new Stack<>();
    public MinStack() {
        minstack = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        minstack.push(val);
        if(stack.isEmpty() || val<=stack.peek())
        {
            stack.push(val);
        }
        else
        {
            stack.push(stack.peek());
        }
    }
    
    public void pop() {
        if(!stack.isEmpty())
        {
            minstack.pop();
            stack.pop();

        }
    }
    
    public int top() {
        return minstack.peek();
    }
    
    public int getMin() {
        return stack.peek();
    }
}

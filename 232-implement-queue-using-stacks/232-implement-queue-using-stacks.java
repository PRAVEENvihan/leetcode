class MyQueue {

    Stack<Integer> queue = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();
    
    public void push(int x) {
        while(!queue.empty())
            temp.push(queue.pop());
        queue.push(x);
        while(!temp.empty())
            queue.push(temp.pop());
    }
    
    public int pop() {
        return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

class MyStack {

    private Queue<Integer> Q=new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        Q.add(x);
        for(int i=1;i<Q.size();i++){
            Q.add(Q.remove());
            
        }
    }
    
    public int pop() {
       return Q.remove();
        
    }
    
    public int top() {
        return Q.peek();
    }
    
    public boolean empty() {
        return Q.isEmpty();
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
// class MyStack {

//     private Queue<Integer> queue = new LinkedList<>();

//     public void push(int x) {
//         queue.add(x);
//         for (int i=1; i<queue.size(); i++)
//             queue.add(queue.remove());
//     }

//     public void pop() {
//         queue.remove();
//     }

//     public int top() {
//         return queue.peek();
//     }

//     public boolean empty() {
//         return queue.isEmpty();
//     }
// }
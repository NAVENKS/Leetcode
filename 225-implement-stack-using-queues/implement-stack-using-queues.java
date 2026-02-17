class MyStack {
    Queue<Integer>q1;
    Queue<Integer>q2;
    public MyStack() {
        q2=new LinkedList<>();
        q1=new LinkedList<>();
    }
    public void push(int x) {
        if(q1.isEmpty())q1.offer(x);
        else q2.offer(x);
        if(q1.size()>q2.size()){
            while(!q1.isEmpty())
            q2.offer(q1.poll());
        }
        else{
            while(!q2.isEmpty())
            q1.offer(q2.poll());
        }
    }
    
    public int pop() {
        if(!q1.isEmpty())return q1.poll();
        return q2.poll();
    }
    
    public int top() {
        if(!q1.isEmpty())return q1.peek();
        return q2.peek();
    }
    
    public boolean empty() {
        return (q1.isEmpty() && q2.isEmpty());
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
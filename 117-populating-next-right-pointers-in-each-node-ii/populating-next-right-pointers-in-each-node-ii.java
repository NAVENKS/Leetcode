/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                Node d=q.poll();
                if(i<s-1)
                {
                    d.next=q.peek();
                }
                if(d.left!=null)q.offer(d.left);
                if(d.right!=null)q.offer(d.right);
            }
        }
        return root;
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer>b=new ArrayList<>();
    public List<Integer> postorder(Node a) {
        if(a==null) return b;
        for(Node x:a.children)
            postorder(x);
        b.add(a.val);
         return b;
        }
}
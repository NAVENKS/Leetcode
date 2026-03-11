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
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        if(root==null)return ans;
        que.offer(root);
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node pop=que.poll();
                l.add(pop.val);
                for(Node n:pop.children){
                    if(n!=null)
                    que.offer(n);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
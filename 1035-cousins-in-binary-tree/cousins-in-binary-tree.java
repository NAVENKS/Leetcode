/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Node{
    int parent;
    int depth;
    Node(){
        parent=1;
        depth=1;
    }
    Node(int p,int d){
        parent=p;
        depth=d;
    }
}
class Solution {
    HashMap<Integer,Node>map=new HashMap<>();
    void fun(TreeNode t,int p){
        if(t==null)return;
        if(!map.containsKey(t.val)){
            map.put(t.val,new Node(p,map.get(p).depth+1));
        }
        fun(t.left,t.val);
        fun(t.right,t.val);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        map.put(root.val,new Node(0,1));
        fun(root,0);
        Node t1=map.get(x);
        Node t2=map.get(y);
        // System.out.println(t1.parent+" "+t2.parent);
        // System.out.println(t1.depth+" "+t2.depth);
        return(t1.parent!=t2.parent)&&(t1.depth==t2.depth);
        // for(int key:map.keySet()){
        //     System.out.println("key: "+key+" parent: "+map.get(key).parent+" depth: "+map.get(key).depth);
        // }
        // return false;
    }
}
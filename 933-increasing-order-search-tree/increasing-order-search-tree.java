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
class Solution {
    PriorityQueue<TreeNode>l=new PriorityQueue<>((a,b)->(a.val-b.val));
    void fun(TreeNode t){
        if(t==null)return;
        l.offer(t);
        fun(t.left);
        fun(t.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        fun(root);
        TreeNode t=l.peek();
        while(!l.isEmpty()){
            TreeNode d=l.poll();
            d.left=null;
            d.right=l.peek();
        }
        return t;
    }
}
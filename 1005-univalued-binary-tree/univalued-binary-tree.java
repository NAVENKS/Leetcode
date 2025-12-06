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
    boolean fun(TreeNode t,int v){
        if(t==null)return true;
        if(t.val!=v)return false;
        boolean l=fun(t.left,v);
        boolean r=fun(t.right,v);
        return l&&r;
    }
    public boolean isUnivalTree(TreeNode root) {
        return fun(root,root.val);
    }
}
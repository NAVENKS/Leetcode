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
    boolean fun(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        else if(p==null || q==null)return false;
        else if(p.val!=q.val)
        return false;
        boolean l=fun(p.left,q.right);
        boolean r=fun(p.right,q.left);
        return l&&r;
    }
    public boolean isSymmetric(TreeNode root) {
        return fun(root.left,root.right);
    }
}
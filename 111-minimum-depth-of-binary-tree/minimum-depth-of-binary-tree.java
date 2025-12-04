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
    int fun(TreeNode tprt){
        if(tprt==null)return 0;
        int l=fun(tprt.left);
        int r=fun(tprt.right);
        if(tprt.left==null)return 1+r;
        if(tprt.right==null)return 1+l;
        return 1+Math.min(l,r);
    }
    public int minDepth(TreeNode root) {
        return fun(root);
    }
}
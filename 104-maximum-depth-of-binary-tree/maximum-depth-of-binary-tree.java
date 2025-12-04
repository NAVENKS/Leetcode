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
        return 1+Math.max(fun(tprt.left),fun(tprt.right));
    }
    public int maxDepth(TreeNode root) {
        return fun(root);
    }
}
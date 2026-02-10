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
    int dep(TreeNode t){
        if(t==null)return 0;
        int l=dep(t.left);
        int r=dep(t.right);
        return Math.max(l,r)+1;
    }
    public int maxDepth(TreeNode root) {
        return dep(root);
    }
}
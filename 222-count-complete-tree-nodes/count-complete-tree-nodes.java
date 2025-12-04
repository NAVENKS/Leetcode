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
    int fun(TreeNode tptr){
        if(tptr==null) return 1;
        int l=fun(tptr.left);
        int r=fun(tptr.right);
        return l+r;
    }
    public int countNodes(TreeNode root) {
        return fun(root)-1;
    }
}
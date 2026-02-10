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
    boolean ans=true;
    int fun(TreeNode t){
        if(t==null)return 0;
        int l=fun(t.left);
        int r=fun(t.right);
        if(Math.abs(l-r)>1){
            ans=false;
            return 0;
        }
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        fun(root);
        return ans;
    }
}
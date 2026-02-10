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
    Integer prev=null;
    int min=Integer.MAX_VALUE;
    void fun(TreeNode t){
        if(t==null)return;
        fun(t.left);
        if(prev!=null)
            min=Math.min(min,Math.abs(prev-t.val));
        prev=t.val;
        fun(t.right);
    }
    public int getMinimumDifference(TreeNode root) {
        fun(root);
        return min;
    }
}
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
    void fun(TreeNode t){
        if(t == null) return;
        TreeNode temp = t.left;
        t.left = t.right;
        t.right = temp;
        fun(t.left);
        fun(t.right);
    }

    public TreeNode invertTree(TreeNode root) {
        fun(root);
        return root;
    }
}

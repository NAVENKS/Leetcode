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
    boolean ans = true;
    long prev = Long.MIN_VALUE;

    void fun(TreeNode t) {
        if (t == null) return;

        fun(t.left);

        if (t.val <= prev) {
            ans = false;
            return;
        }
        prev = t.val;

        fun(t.right);
    }

    public boolean isValidBST(TreeNode root) {
        fun(root);
        return ans;
    }
}

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
    int fun(TreeNode t){
        if(t == null) return 0;
        int sum = 0;
        if(t.left != null && t.left.left == null && t.left.right == null) {
            sum += t.left.val;
        }
        return sum + fun(t.left) + fun(t.right);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return fun(root);
    }
}

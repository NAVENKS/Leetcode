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
    String ans = null;

    public void dfs(TreeNode root, String path) {
        if (root == null) return;
        char c = (char)('a' + root.val);
        path = c + path;
        if (root.left == null && root.right == null) {
            if (ans == null || path.compareTo(ans) < 0) {
                ans = path;
            }
        }

        dfs(root.left, path);
        dfs(root.right, path);
    }

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        return ans;
    }
}

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
    void fun(TreeNode t, List<TreeNode> l){
        if (t == null) return;
        l.add(t);
        fun(t.left, l);
        fun(t.right, l);
    }

    public void flatten(TreeNode root) {
        if (root == null) return;
        List<TreeNode> l = new ArrayList<>();
        fun(root, l);

        for (int i = 0; i < l.size(); i++) {
            TreeNode cur = l.get(i);
            cur.left = null;
            cur.right = (i + 1 < l.size()) ? l.get(i + 1) : null;
        }
    }
}

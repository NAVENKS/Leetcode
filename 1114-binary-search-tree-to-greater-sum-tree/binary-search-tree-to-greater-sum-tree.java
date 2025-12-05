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
    int fun(TreeNode t,int sum){
        if(t==null)return sum;
        int r=fun(t.right,sum);
        t.val+=r;
        int l=fun(t.left,t.val);
        return l;
    }
    public TreeNode bstToGst(TreeNode root) {
        fun(root,0);
        return root;
    }
}
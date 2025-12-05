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
    int fun(TreeNode root,int[] s){
        if(root==null)return 0;
        int l=fun(root.left,s);
        int r=fun(root.right,s);
        s[0]=Math.max((l+r),s[0]);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int sum[]=new int[1];
        sum[0]=0;
        fun(root,sum);
        return sum[0];
    }
}
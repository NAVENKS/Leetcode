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
    int fun(TreeNode t,int dir){
        if(t==null)return 0;
        if(t.left==null && t.right==null && dir==1){
            return t.val;
        }
        int l=fun(t.left,1);
        int r=0;
        r=fun(t.right,0);
        System.out.println(r+" "+l);
        return l+r;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root.left==null && root.right==null) return 0;
        return fun(root,0);
    }
}
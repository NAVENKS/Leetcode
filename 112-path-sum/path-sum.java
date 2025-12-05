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
    boolean ans[]=new boolean [1];
    int fun(TreeNode tp,int t,int s){
        if(tp==null)return s;
        s+=tp.val;
        int l=fun(tp.left,t,s);
        int r=fun(tp.right,t,s);
        if(l==t && tp.left==null && tp.right==null)ans[0]=true;
        if(r==t && tp.left==null && tp.right==null)ans[0]=true;
        return s;
    }
    public boolean hasPathSum(TreeNode root, int t) {
        fun(root,t,0);
        return ans[0];
    }
}
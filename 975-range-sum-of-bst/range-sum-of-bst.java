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
    void fun(TreeNode t,int l,int h,int n[]){
        if(t==null)return;
        if(t.val >=l && t.val<=h){
            n[0]+=t.val;
        }
        fun(t.left,l,h,n);
        fun(t.right,l,h,n);
    }
    public int rangeSumBST(TreeNode root, int l, int h) {
        int n[]={0};
        fun(root,l,h,n);
        return n[0];
    }
}
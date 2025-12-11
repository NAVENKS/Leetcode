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
    int ans=0;
    void fun(TreeNode t,int s){
        if(t==null)return;
        s=s*10+t.val;
        if(t.left==null && t.right==null)
        ans+=s;
        fun(t.left,s);
        fun(t.right,s);
    }
    public int sumNumbers(TreeNode root) {
        fun(root,0);
        return ans;
    }
}
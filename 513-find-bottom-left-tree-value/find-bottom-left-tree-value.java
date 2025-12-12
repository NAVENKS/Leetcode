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
    int d=0;
    void fun(TreeNode t,int c){
        if(t==null)return;
        c++;
        if(t.left!=null && t.left.left==null && t.left.right==null && c>d){
            ans=t.left.val;
            d=c;
        }
        else if(t.right!=null && t.right.left==null && t.right.right==null && c>d){
            ans=t.right.val;
            d=c;
        }
        fun(t.left,c);
        fun(t.right,c);
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null)return root.val;
        if(root.left==null && root.right!=null && root.right.left==null &&
        root.right.right==null)return root.right.val;
        fun(root,0);
        return ans;
    }
}
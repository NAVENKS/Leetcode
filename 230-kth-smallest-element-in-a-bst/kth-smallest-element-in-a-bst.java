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
    int ans;
    int c=0;
    void fun(TreeNode t,int k){
        if(t==null)return;
        fun(t.left,k);
        c++;
        if(c==k){
            ans=t.val;
            return;
        }
        fun(t.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        fun(root,k);
        return ans;
    }
}
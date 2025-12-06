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
    int fun(TreeNode t,int l,int h){
        if(t==null)return 0;
        int s=0;
        if(t.val >=l && t.val<=h){
            s+=t.val;
        }
        s+=fun(t.left,l,h);
        s+=fun(t.right,l,h);
        return s;
    }
    public int rangeSumBST(TreeNode root, int l, int h) {
        return fun(root,l,h);
    }
}
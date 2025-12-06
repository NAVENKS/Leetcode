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
    boolean fun(TreeNode t){
        boolean l=true,r=true;
        if(t.left!=null && t.right!=null){
            l=fun(t.left);
            r=fun(t.right);
        }
        else{
            if(t.val==1)return true;
            else return false;
        }
        if(t.val == 2){
            return l||r;
        }
        else return l&&r;
    }
    public boolean evaluateTree(TreeNode root) {
        return fun(root);
    }
}
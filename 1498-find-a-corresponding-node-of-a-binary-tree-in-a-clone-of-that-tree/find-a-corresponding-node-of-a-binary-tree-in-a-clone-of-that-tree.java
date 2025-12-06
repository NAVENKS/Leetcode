/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    void fun(TreeNode t,TreeNode r){
        if(t==null)return;
        if(t.val==r.val){
            ans=t;
        }
        fun(t.left,r);
        fun(t.right,r);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        fun(cloned,target);
        return ans;
    }
}
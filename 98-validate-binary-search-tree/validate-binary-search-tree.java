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
    boolean ans=true;
    List<Integer>a=new ArrayList<>();
    void fun(TreeNode t){
        if(t==null)return;
        fun(t.left);
        if(!a.isEmpty() && a.get(a.size()-1)>=t.val){
            ans=false;
        }
        a.add(t.val);
        fun(t.right);
    }
    public boolean isValidBST(TreeNode root) {
        fun(root);
        return ans;
    }
}
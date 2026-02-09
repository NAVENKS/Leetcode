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
    List<String> ans = new ArrayList<>();
    void fun(TreeNode t,String s){
        if(t==null)return;
        if(t.left==null && t.right==null){
        s+=t.val+"";
        ans.add(s);
        }
        else
        s+=t.val+"->";
        fun(t.left,s);
        fun(t.right,s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        fun(root,"");
        return ans;
    }
}
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
    List<Integer>ans=new ArrayList<>();
    int min=Integer.MAX_VALUE;
    void fun(TreeNode t){
        if(t==null)return;
        fun(t.left);
        if(!ans.isEmpty()){
            min=Math.min(min,Math.abs(ans.get(ans.size()-1)-t.val));
        }
        ans.add(t.val);
        fun(t.right);
    }
    public int getMinimumDifference(TreeNode root) {
        fun(root);
        return min;
    }
}
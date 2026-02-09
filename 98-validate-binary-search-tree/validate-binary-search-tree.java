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
    void fun(TreeNode t){
        if(t==null)return;
        fun(t.left);
        ans.add(t.val);
        fun(t.right);
    }
    public boolean isValidBST(TreeNode root) {
        fun(root);
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>=ans.get(i+1))
            return false;
        }
        return true;
    }
}
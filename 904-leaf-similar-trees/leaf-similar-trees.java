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
    void fun(TreeNode r,ArrayList<Integer>l){
        if(r==null)return;
        if(r.left==null && r.right==null){
            l.add(r.val);
        }
        fun(r.left,l);
        fun(r.right,l);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        fun(root1,l1);
        fun(root2,l2);
        return l1.equals(l2);
    }
}
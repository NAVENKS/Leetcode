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
    void fun(TreeNode t,List<String>l){
        if(t==null){
            l.add("null");
            return;
        }
        l.add(t.val+"");
        fun(t.left,l);
        fun(t.right,l);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<String>l1=new ArrayList<>();
        List<String>l2=new ArrayList<>();
        fun(p,l1);
        fun(q,l2);
        return l1.equals(l2);
    }
}
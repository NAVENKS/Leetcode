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
        fun(t.right,l);
        fun(t.left,l);
    }
    void fun2(TreeNode t,List<String>l){
        if(t==null){
            l.add("null");
            return;
        }
        l.add(t.val+"");
        fun2(t.left,l);
        fun2(t.right,l);
    }
    public boolean isSymmetric(TreeNode root) {
        List<String>l1=new ArrayList<>();
        List<String>l2=new ArrayList<>();
        fun(root.left,l1);
        fun2(root.right,l2);
        System.out.println(l1);
        System.out.println(l2);
        return l1.equals(l2);
    }
}
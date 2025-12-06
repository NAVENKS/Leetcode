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
    void fun1(TreeNode t, StringBuilder s1){
        if(t==null){  
            s1.append("null");
            return;      
        }
        s1.append('[').append(t.val).append(']');
        fun1(t.left,s1);
        fun1(t.right,s1);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder s1=new StringBuilder();     
        StringBuilder s2=new StringBuilder();
        fun1(root,s1);
        fun1(subRoot,s2);
        System.out.println(s1.toString());
        System.out.print(s2.toString());
        return s1.toString().contains(s2.toString());  
    }
}
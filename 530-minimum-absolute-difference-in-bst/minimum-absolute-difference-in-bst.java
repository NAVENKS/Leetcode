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
    List<Integer>list=new ArrayList<>();
    void fun(TreeNode t){
        if(t==null)return;
        list.add(t.val);
        fun(t.left);
        fun(t.right);
    }
    public int getMinimumDifference(TreeNode root) {
        fun(root);
        Collections.sort(list);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            min=Math.min(min,Math.abs(list.get(i)-list.get(i-1)));
        }
        return min;
    }
}
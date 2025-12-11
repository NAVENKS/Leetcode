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
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    void fun(TreeNode t){
        if(t==null)return;
        pq.offer(t.val);
        fun(t.left);
        fun(t.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        fun(root);
        int ans=0;
        for(int i=0;i<k;i++)
        ans=pq.poll();
        return ans;
    }
}
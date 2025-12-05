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
    HashMap<Integer,Integer>map=new HashMap<>();
    void fun(TreeNode t,PriorityQueue<Integer>pq){
        if(t==null)return;
        if(!map.containsKey(t.val))
        {
            pq.offer(t.val);
            map.put(t.val,0);
        }
        fun(t.left,pq);
        fun(t.right,pq);
    }
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        fun(root,pq);
        if(pq.size()==1)return -1;
        pq.poll();
        return pq.peek();
    }
}
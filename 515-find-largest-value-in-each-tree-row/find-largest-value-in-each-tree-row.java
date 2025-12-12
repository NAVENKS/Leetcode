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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        int m=Integer.MIN_VALUE;
        q.offer(root);
        List<Integer>l=new ArrayList<>();
        if(root==null)return l;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode d=q.poll();
                if(d.left!=null)q.offer(d.left);
                if(d.right!=null)q.offer(d.right);
                m=Math.max(m,d.val);
            }
            l.add(m);
            m=Integer.MIN_VALUE;
        }
        return l;
    }
}
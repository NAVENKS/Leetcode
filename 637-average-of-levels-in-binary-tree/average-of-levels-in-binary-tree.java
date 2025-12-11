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
    public List<Double> averageOfLevels(TreeNode root) {
        double ans=0;
        Queue<TreeNode>q=new LinkedList<>();
        List<Double>l=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            ans=0;
            for(int i=0;i<s;i++){
            TreeNode d=q.poll();
            ans+=d.val;
            if(d.left!=null)q.offer(d.left);
            if(d.right!=null)q.offer(d.right);
            }
            ans/=s;
            l.add(ans);
        }
        return l;
    }
}
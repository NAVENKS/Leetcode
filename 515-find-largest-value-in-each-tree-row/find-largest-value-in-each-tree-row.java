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
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null)return new ArrayList<>();
        q.offer(root);
        List<Integer> l = new ArrayList<>();
        while(!q.isEmpty()){
            int s=q.size();
            int max=q.peek().val;
            for(int i=0;i<s;i++){
                TreeNode node = q.poll();
                max=Math.max(max,node.val);
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
                l.add(max);
        }
        return l;
    }
}
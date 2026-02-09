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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null)return new ArrayList<>();
        q.offer(root);
        int e=0;
        while(!q.isEmpty()){
            int s=q.size();
            e++;
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
            if(e%2==0)
            Collections.reverse(l);
            ans.add(new ArrayList<>(l));
        }
        return ans;
    }
}
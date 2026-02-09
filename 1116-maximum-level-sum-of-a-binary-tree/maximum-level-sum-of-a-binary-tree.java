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
    public int maxLevelSum(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
        if (root==null)return 0;
        q.offer(root);
        int max=Integer.MIN_VALUE;
        int level=0;
        int l=0;
        while(!q.isEmpty()){
            int s=q.size();
            l++;
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode node = q.poll();
                sum+=node.val;
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
            if(max<sum){
                max=sum;
                level=l;
            }
        }
        return level;
    }
}
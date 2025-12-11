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
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>list=new ArrayList<>();
        if(root==null)return list;
        List<Integer>l=new ArrayList<>();
        int z=1;
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            l.clear();
            for(int i=0;i<s;i++){
                TreeNode d=q.poll();
                if(d.left!=null)q.offer(d.left);
                if(d.right!=null)q.offer(d.right);
                l.add(d.val);
            }
            list.add(new ArrayList<>(l));
        }
        for(int i=1;i<list.size();i=i+2){
            Collections.reverse(list.get(i));
        }
        return list;
    }
}
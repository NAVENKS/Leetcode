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
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode d;
        int c;
    Queue<TreeNode>q=new LinkedList<>();
    List<List<Integer>>list=new ArrayList<>();
    List<Integer>l=new ArrayList<>();
        if(root==null)return list;
        q.add(root);
        while(!q.isEmpty()){
            c=q.size();
            for(int i=0;i<c;i++){
                d=q.poll();
                l.add(d.val);
                if(d.left!=null)q.add(d.left);
                if(d.right!=null)q.add(d.right);
            }
            list.add(new ArrayList<>(l));
            l.clear();
        }        
        return list;
    }
}
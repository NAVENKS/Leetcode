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
    boolean fun(TreeNode t,int k){
        if(t==null)return false;
        // if(t.val==k)return true;
        if(map.containsKey(k-t.val))
        {return true;}
        map.put(t.val,0);
        boolean l=fun(t.left,k);
        if(l)return true;
        boolean r=fun(t.right,k);
        if(r)return true;
        return l||r;
    }
    public boolean findTarget(TreeNode root, int k) {
        return fun(root,k);
    }
}
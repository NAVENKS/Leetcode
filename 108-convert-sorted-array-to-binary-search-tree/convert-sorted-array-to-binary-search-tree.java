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
    int i=1;
    TreeNode fun(TreeNode t,int s,int e,int n[]){
        int m=(s+e)/2;
        if(e<0 || s>e)return null;
        if(m>=n.length)return null;
        t.val=n[m];
        System.out.println(m);
        t.left=fun(new TreeNode(),s,m-1,n);
        t.right=fun(new TreeNode(),m+1,e,n);
        return t;
    }
    public TreeNode sortedArrayToBST(int[] n) {
        TreeNode root=new TreeNode();
        TreeNode t=root;
        return fun(root,0,n.length,n);
        
    }
}
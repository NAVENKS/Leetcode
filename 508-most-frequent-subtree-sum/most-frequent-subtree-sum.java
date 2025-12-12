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
    int m=Integer.MIN_VALUE;
    int fun(TreeNode t){
        if(t==null)return 0;
        int l=fun(t.left);
        int r=fun(t.right);
        map.put(t.val+l+r,map.getOrDefault(t.val+l+r,0)+1);
        m=Math.max(map.get(t.val+l+r),m);
        return t.val+l+r;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        int ans[]=new int[1000];
        int l=0;
        fun(root);
        for(int k:map.keySet()){
            if(map.get(k)==m)
            ans[l++]=k;
        }
        return Arrays.copyOfRange(ans,0,l);
    }
}
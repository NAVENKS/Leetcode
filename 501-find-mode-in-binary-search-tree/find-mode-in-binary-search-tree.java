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
    void fun(TreeNode t){
        if(t==null)return;
        map.put(t.val,map.getOrDefault(t.val,0)+1);
        fun(t.left);
        fun(t.right);
    }
    public int[] findMode(TreeNode root) {
        fun(root);
        System.out.print(map);
        int max=Integer.MIN_VALUE;
        for(int k:map.keySet()){
            max=Math.max(max,map.get(k));
        }
        int max_count=0;
        for(int k:map.keySet()){
            if(map.get(k)==max)max_count++;
        }
        int n[]=new int[max_count];
        int i=0;
        for(int k:map.keySet()){
            if(map.get(k)==max){
                n[i++]=k;
            }
        }
        // if(max==1)
        // return new int[]{0};
        return n;
    }
}
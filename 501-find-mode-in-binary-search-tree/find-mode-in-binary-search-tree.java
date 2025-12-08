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
    int max=Integer.MIN_VALUE;
    HashMap<Integer,List<Integer>>m=new HashMap<>();
    HashMap<Integer,Integer>f=new HashMap<>();
    void fun(TreeNode t){
        if(t==null)return;
        if(f.containsKey(t.val)){
            int fre=f.get(t.val);
            max=Math.max(max,fre+1);
            int i=m.get(fre).indexOf(t.val);
            m.get(fre).remove(i);
            if(m.containsKey(fre+1)){
                m.get(fre+1).add(t.val);
            }
            else{
            m.put(fre+1,new ArrayList<>());
            m.get(fre+1).add(t.val);
            }
            f.put(t.val,f.get(t.val)+1);
        }
        else{
            max=Math.max(max,1);
             if(m.containsKey(1)){
                m.get(1).add(t.val);
                f.put(t.val,1);
            }
            else{
            m.put(1,new ArrayList<>());
            m.get(1).add(t.val);
             f.put(t.val,1);
            }
        }
        fun(t.left);
        fun(t.right);
    }
    public int[] findMode(TreeNode root) {
        fun(root);
        System.out.print(m);
        System.out.println(f);
        System.out.print(max);
        int n[]=new int[m.get(max).size()];
        List<Integer>l=m.get(max);
        for(int i=0;i<l.size();i++){
            n[i]=l.get(i);
        }
        // return new int[]{0};
        return n;
    }
}
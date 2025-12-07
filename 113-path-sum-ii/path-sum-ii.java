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
    void fun(TreeNode t,List<String>list,String path,int s,int ta){
        if(t==null)return;
        s+=t.val;
        path+=t.val;
        if(s==ta && t.left==null && t.right==null){
            list.add(path);
            return;
        }
        path+=",";
        fun(t.left,list,path,s,ta);
        fun(t.right,list,path,s,ta);
    }
    public List<List<Integer>> pathSum(TreeNode root, int ta) {
        List<String>list=new ArrayList<>();
        List<List<Integer>>list1=new ArrayList<>();
        String path="";
        fun(root,list,"",0,ta);
        System.out.print(list);
        for(int i=0;i<list.size();i++){
            List<Integer>n=new ArrayList<>();
            String s=list.get(i);
            for (String num : s.split(",")) {
    n.add(Integer.parseInt(num));
}
            list1.add(new ArrayList<>(n));
        }
        return list1;
    }
}
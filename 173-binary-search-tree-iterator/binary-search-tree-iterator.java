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
class BSTIterator {
    List<TreeNode>l=new ArrayList<>();
    int i=0;
    public BSTIterator(TreeNode root) {
        fun(root);
    }
    void fun(TreeNode t){
        if(t==null)return;
        fun(t.left);
        l.add(t);
        fun(t.right);
    }
    public int next() {
        int ans=l.get(i).val;
        l.remove(i);
        return ans;
    }
    
    public boolean hasNext() {
        return !l.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
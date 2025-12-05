class Solution {
    public int height(TreeNode t){
        if(t==null) return 0;
        int l=height(t.left);
        int r=height(t.right);
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode t) {
        if(t==null) return true;
        int l=height(t.left);
        int r=height(t.right);
        if(Math.abs(l-r)>1) return false;
        return isBalanced(t.left) && isBalanced(t.right);
    }
}
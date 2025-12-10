/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    TreeNode fun(TreeNode t,int s,int e,List<Integer>n){
        int m=(s+e)/2;
        if(e<0 || s>e || m>=n.size())return null;
        t.val=n.get(m);
        t.left=fun(new TreeNode(),s,m-1,n);
        t.right=fun(new TreeNode(),m+1,e,n);
        return t;
    }
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode root=new TreeNode();
        TreeNode t=root;
        List<Integer>n=new ArrayList<>();
        while(head!=null){
            n.add(head.val);
            head=head.next;
        }
        return fun(root,0,n.size(),n);
    }
}
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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode tem=null;
        while(head!=null){
            tem=head.next;
            head.next=null;
            stack.push(head);
            head=tem;
        }
        ListNode ans = stack.peek();
        while(!stack.isEmpty()){
            ListNode pre = stack.pop();
            if(!stack.isEmpty()){
                pre.next=stack.peek();
            }
        }
        return ans;
    }
    // public ListNode reverseList(ListNode head) {
    //     if(head==null || head.next==null)return head;
    //     ListNode curr=head;
    //     ListNode pre=null;
    //     while(curr!=null){
    //         ListNode t=curr.next;
    //         curr.next=pre;
    //         pre=curr;
    //         curr=t;
    //     }
    //     return pre;
    // }
}
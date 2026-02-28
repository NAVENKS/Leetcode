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
    public void reorderList(ListNode head) {
        if(head.next==null)return;
        Deque<ListNode>stack = new ArrayDeque<>();
        ListNode temp = head;
        while(temp!=null){
            stack.addLast(temp);
            temp=temp.next;
        }
        ListNode prev=null;
        while(stack.size()>=2){
            ListNode f=stack.removeFirst();
            ListNode l=stack.removeLast();
            f.next=l;
            l.next=null;
            if(prev!=null)
            prev.next=f;
            prev=l;
        }
        if(!stack.isEmpty()){
            prev.next=stack.peek();
            stack.peek().next=null;
        }
    }
}
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode head:lists){
            while(head!=null){
                pq.offer(head);
                head=head.next;
            }
        }
        ListNode head=pq.peek();
        ListNode prev=null;
        while(!pq.isEmpty()){
            ListNode n=pq.poll();
            if(prev==null){
                prev=n;
                n.next=null;
            }
            else{
                prev.next=n;
                n.next=null;
                prev=n;
            }
        }
        return head;
    }
}
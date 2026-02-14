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
                ListNode t=head.next;
                head.next=null;
                pq.offer(head);
                head=t;
            }
        }
        ListNode head=pq.peek();
        ListNode prev=null;
        while(!pq.isEmpty()){
            ListNode n=pq.poll();
            if(prev==null){
                prev=n;
            }
            else{
                prev.next=n;
                prev=n;
            }
        }
        return head;
    }
}
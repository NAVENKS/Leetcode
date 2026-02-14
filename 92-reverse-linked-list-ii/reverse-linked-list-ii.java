class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null || left == right)
            return head;
        ListNode prevLeft = null;
        ListNode curr = head;
        for (int i = 1; i < left; i++) {
            prevLeft = curr;
            curr = curr.next;
        }

        ListNode start = curr;
        ListNode prev = null;

        for (int i = 0; i <= right - left; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        if (prevLeft != null) {
            prevLeft.next = prev;
        } else {
            head = prev;
        }

        start.next = curr;

        return head;
    }
}

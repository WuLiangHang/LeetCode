package linkedlist;

public class LeetCode203 {
    int val;
    ListNode preFirst = null;
    ListNode pre = null;

    public ListNode removeElements(ListNode head, int val) {
        preFirst = new ListNode(-1);
        this.val = val;
        pre = head;
        helper(head);
        return preFirst.next;
    }

    public void helper(ListNode head) {
        if (head == null) {
            return;
        }
        if (val == head.val) {
            pre.next = head.next;
        } else {
            if (preFirst.next == null) {
                preFirst.next = head;
            }
            pre = head;
        }
        helper(head.next);
    }
}

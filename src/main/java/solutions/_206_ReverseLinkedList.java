package solutions;

import Utilities.ListNode;

public class _206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode previousNode = null;
        ListNode root = null;

        while (head != null) {
            previousNode = root;
            root = head;
            head = head.next;

            root.next = previousNode;
        }

        return root;
    }
}

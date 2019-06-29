package solutions;

import Utilities.ListNode;

import java.util.List;

public class _2_AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1); //.next = new ListNode(4).next = new ListNode(3);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);// .next = new ListNode(4);

        System.out.println(new _2_AddTwoNumbers().addTwoNumbers(l1, l2));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(Integer.MIN_VALUE);

        int carry = 0;

        ListNode currentNode = head;
        while(l1 != null  || l2 != null) {

            int sum = (l1 != null? l1.val : 0) + (l2 != null? l2.val : 0) + carry;
            carry = sum / 10;
            sum %= 10;
            currentNode.next = new ListNode(sum);
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            currentNode = currentNode.next;
        }

        if (carry != 0)
            currentNode.next = new ListNode(carry);
        return head.next;
    }
}

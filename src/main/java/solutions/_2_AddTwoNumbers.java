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

        ListNode head = null;

        int carry = 0;
        int sum = (l1 != null? l1.val : 0)  + (l2 != null? l2.val : 0)  + carry;
        carry = sum / 10;
        sum %= 10;
        head = new ListNode(sum);
        ListNode currentNode = head;
        l1 = l1.next; l2 = l2.next;


        while(l1 != null  && l2 != null) {

            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            currentNode.next = new ListNode(sum);
            l1 = l1.next; l2 = l2.next; currentNode = currentNode.next;
        }

        while(l1 != null) {
            sum = l1.val + carry;
            carry = sum / 10;
            sum %= 10;
            currentNode.next = new ListNode(sum);
            l1 = l1.next; currentNode = currentNode.next;
        }

        while(l2 != null) {
            sum = l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            currentNode.next = new ListNode(sum);
            l2 = l2.next; currentNode = currentNode.next;
        }

        /*carry  = this.addRemainingElements(currentNode, l1, carry);

        carry = this.addRemainingElements(currentNode, l2, carry);*/

        if (carry != 0)
            currentNode.next = new ListNode(carry);
        return head;
    }

    private int addRemainingElements(ListNode currentNode, ListNode element, int carry) {

        while(element != null) {
            int sum = element.val + carry;
            carry = sum / 10;
            sum %= 10;
            currentNode.next = new ListNode(sum);
            element = element.next; currentNode = currentNode.next;
        }

        return carry;
    }
}

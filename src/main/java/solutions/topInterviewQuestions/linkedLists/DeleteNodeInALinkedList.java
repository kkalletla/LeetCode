package solutions.topInterviewQuestions.linkedLists;

import Utilities.ListNode;

public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {

        ListNode currentNode = node;
        ListNode previousNode = null;

        while (currentNode != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}

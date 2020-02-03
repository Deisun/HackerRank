public class LinkedListDetectCycle2 {

    private class Node {
        int val;
        Node next;
    }

    private static boolean detectCycle(Node head) {

        if (head == null) return false;

        Node slow = head;
        Node fast = head.next;

        while (slow != null && fast != null) {

            if (slow == head) return true;

            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

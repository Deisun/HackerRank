public class LinkedListDetectCycle {

    private static boolean hasCycle(Node head) {

        if (head == null) return false;

        Node slow = head;
        Node fast = head.next;

        while (slow != null && fast != null) {

            if (slow == fast) {
                return true;
            }

            slow = head.next;
            fast = head.next.next;
        }
        return false;
    }

    private class Node {
        Node next;
        int val;
    }
}

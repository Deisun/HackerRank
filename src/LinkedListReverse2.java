public class LinkedListReverse2 {

    private class Node {
        Node next;
        int val;
    }

    private static Node reverse(Node head) {

        if (head == null) return head;

        Node previousNode = null;
        Node currentNode = head;

        while (currentNode != null) {

            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

        }

        return previousNode;
    }
}

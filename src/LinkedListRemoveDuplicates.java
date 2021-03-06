import java.util.HashSet;

public class LinkedListRemoveDuplicates {

    void deleteDuplicates(Node node) {
        HashSet<Integer> set = new HashSet<>();
        Node previous = null;

        while (node != null) {
            if (set.contains(node.data)) {
                // remove node
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }

            node = node.next;
        }
    }

    private class Node {
        int data;
        Node next;
    }
}

import java.util.HashSet;

public class LinkedListRemoveDuplicates {

    void deleteDuplicates(LinkedListNode node) {
        HashSet<Integer> set = new HashSet<>();


        LinkedListNode previous = null;

        while (node != null) {
            if (set.contains(node)) {
                // remove node
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }

            node = node.next;
        }
    }
}

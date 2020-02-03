public class LinkedListReverse {


    private class LinkedNode {
        int val;
        LinkedNode next;
        LinkedNode(int x) {
            val = x;
        }
    }

    public LinkedNode reverse (LinkedNode node) {
        LinkedNode previousNode = null;

        while (node != null) {

            // capture next node first
            LinkedNode nextNode = node.next;

            node.next = previousNode;

            previousNode = node;
            node = nextNode;


        }

        return previousNode;
    }


}

public class reverseLinkedList {


    private class LinkedNode {
        int val;
        LinkedNode next;
        LinkedNode(int x) {
            val = x;
        }
    }

    public LinkedNode reverse (LinkedNode head) {
        LinkedNode previousNode = null;

        while (head != null) {

            // capture next node first
            LinkedNode nextNode = head.next;

            head.next = previousNode;
            previousNode = head;

            head = nextNode;


        }

        return previousNode;
    }


}

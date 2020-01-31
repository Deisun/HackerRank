public class BinarySearchTreeLeafNodes2 {

    private class Node {
        int val;
        Node leftChild;
        Node rightChild;

        private Node() {

        }
    }


    public int getLeafCount(Node node) {

        if (node == null) {
            return 0;
        } else if (node.leftChild == null && node.rightChild == null) {
            return 1;
        } else {

            return getLeafCount(node.leftChild) + getLeafCount(node.rightChild);
        }
    }
}

public class BinarySearchTree1 {


    private class Node {
        int value;
        Node left;
        Node right;
    }



    private boolean isBST(Node node) {
        return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.value < min || node.value > max) {
            return false;
        }

        return isBST(node.left, min, node.value) && isBST(node.right, node.value + 1, max);
    }


}

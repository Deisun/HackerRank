public class BinaryTreeHeight {


    private static int height(Node root) {
        int leftHeight = 0;
        int rightHeight = 0;

        if (root == null) return 0;

        if (root.left != null) {
            leftHeight = 1 + height(root.left);
        }

        if (root.right != null) {
            rightHeight = 1 + height(root.right);
        }
        return Math.max(leftHeight, rightHeight);
    }

    private class Node {
        Node left;
        Node right;
    }
}

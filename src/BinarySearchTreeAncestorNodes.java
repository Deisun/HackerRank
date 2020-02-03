public class BinarySearchTreeAncestorNodes {

    private class Node {
        Node left;
        Node right;
        int data;
    }

    static Node lca(Node root,int v1,int v2)
    {
        if (root.data < v1 && root.data < v2) {
            lca(root.right, v1, v2);
        }

        if (root.data > v1 && root.data > v2) {
            lca(root.left, v1, v2);
        }

        return root;

    }
}

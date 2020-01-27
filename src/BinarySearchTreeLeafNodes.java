public class BinarySearchTreeLeafNodes {


    public int getLeafCount(Node node) {
        // check root node
        if (node == null) {
            return 0;
            // check left node and right node for null
        } else if (node.leftChild == null && node.rightChild == null) {
            //we found 1 leaf node
            return 1;
        } else {
            //recursively find leaf nodes
            return getLeafCount(node.leftChild) + getLeafCount(node.rightChild);
        }
    }


}

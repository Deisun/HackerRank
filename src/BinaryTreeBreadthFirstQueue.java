import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBreadthFirstQueue {
    /*
    Here is the solution in a java method.
(Note it adds commas in between each node for easier reading of the output)


    private String toStringRows(Node root) {
        LinkedList<Node> queue = new LinkedList();

        queue.add(root);
        int remainingNodesInCurrentRow = 1;

        String output = "\n";
        String comma = "";

        while (!queue.isEmpty()) {
            Node node = queue.removeFirst();
            remainingNodesInCurrentRow--;
            output += comma + node.value;
            comma = ",";
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);

            if (remainingNodesInCurrentRow == 0) {
                output += "\n";
                comma = "";
                remainingNodesInCurrentRow = queue.size();
            }
        }
        return output;
    }
     */


    public static void main(String[] args) {

        System.out.println();

    }

    private String toStringRows(Node root) {
        String output = "";
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        int remainingNodesInCurrentRow = 1;

        while (!q.isEmpty()) {
            Node node = q.element();

        }


        return output;
    }



    private class Node {
        Node left;
        Node right;
        int val;
    }
}

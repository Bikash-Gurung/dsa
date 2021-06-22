package datastructures.nonlinear;


public class Tree {
    Node root = null;

    class Node {
        char data;
        Node left;
        Node right;

        public Node(char data) {
            this.data = data;
        }
    }
}

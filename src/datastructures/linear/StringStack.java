package datastructures.linear;

public class StringStack {

    Node top;
    int length = 0;

    class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public void push(char data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        length++;
    }

    public void print() {
        if (top == null) {
            System.out.print("null");
        } else {
            Node currentNode = top;
            while (currentNode != null) {
                System.out.print(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public int pop() {
        if (top == null) {
            return -1;
        } else if (top.next == null) {
            int result = top.data;
            top = null;
            length--;

            return result;
        } else {
            int result = top.data;
            top = top.next;
            length--;

            return result;
        }
    }

    public int peek() {
        if (top == null) {
            return -1;
        } else {
            return top.data;
        }
    }

    public static void main(String[] args) {
        StringStack stack = new StringStack();

        //reverse string using stack
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        stack.print();
    }
}

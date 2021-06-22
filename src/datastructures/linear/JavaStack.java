package datastructures.linear;


public class JavaStack {

    Node top;
    int length = 0;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int data) {
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
                System.out.print(currentNode.data + "-->");
                currentNode = currentNode.next;
            }

            System.out.print("null");
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
        JavaStack stack = new JavaStack();
//        stack.push(10);
//        System.out.println("peek value is: " + stack.peek());
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.print();
//
//        stack.pop();
//        System.out.println("\nAfter calling pop");
//        stack.print();


        //reverse string using stack
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        stack.print();
    }
}

package datastructures.linear;

public class JavaQueue {

    Node front = null;
    Node rear = null;
    int length;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void print() {
        Node current = front;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.print("null");
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
        } else if (front != null && rear == null) {
            rear = newNode;
            front.next = rear;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        length++;
    }

    public int dequeue() {
        int frontData = front.data;
        front = front.next;

        return frontData;
    }

    public static void main(String[] args) {
        JavaQueue queue = new JavaQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();

        System.out.println(queue.dequeue());
        queue.print();

        queue.enqueue(50);
        System.out.println("");
        queue.print();
    }
}

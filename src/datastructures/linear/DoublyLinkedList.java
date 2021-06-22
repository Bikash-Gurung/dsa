package datastructures.linear;

public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;
    private int length = 0;

    class Node {
        private int data;
        private Node next;
        private Node prev;

        // constructor
        Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
//        return length == 0;
        return head == null;
    }

    public int length() {
        return length;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <--> ");
            current = current.next;
        }

        System.out.print("null");
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
            newNode.prev = currentNode;
            tail = newNode;
            length++;
        }
    }

    public static void main(JavaString[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(23);
        list.print();
    }
}

package datastructures.linear;

public class SinglyLinkedList {
    private Node head = null;
    // Using this class variable we can reduce get length of linked list from O(n) to O(1) complexity
    private long size = 0;

    // inner class
    class Node {
        private int data;
        private Node next;

        // constructor
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // inserts node in the end
    // Time complexity: O(n)
    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node lastNode = this.head;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }

        size++;
    }

    // inserts node in the end
    // Time complexity: O(1)
    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }

        size++;
    }

    // insert node at certain position
    // Time complexity: O(n)
    public void insert(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            insertFirst(data);
        } else {
            int currentPosition = 1;
            Node currentNode = this.head;

            while (currentPosition < position - 1) {
                currentPosition++;
                currentNode = currentNode.next;
            }

            if (currentNode == null) {
                System.out.println("invalid position");
                return;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }

        size++;
    }

    // prints all node in linked list
    // Time complexity: O(n)
    public void print() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }

        System.out.print("null");
    }

    // returns numbers of nodes of the singly linked list
    // Time complexity: O(n)
    public long length() {
        if (head == null) {
            return 0;
        }

        long length = 0;
        Node current = this.head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    // deletes first node
    public void deleteFirst() {
        if (this.head == null) {
            System.out.println("No items to delete");
            return;
        }

        if (this.head.next == null) {
            head = null;
            size--;
            return;
        }

        this.head = this.head.next;
        size--;
    }

    // deletes last node
    public void deleteLast() {
        if (this.head == null) {
            System.out.println("No items to delete");
            return;
        }

        if (this.head.next == null) {
            head = null;
            size--;
            return;
        }

        Node currentNode = this.head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = null;
        size--;
    }

    // delete node from singly linked list at given position
    public void delete(int position) {
        if (position == 1) {
            deleteFirst();
        } else {
            int currentPosition = 1;
            Node currentNode = this.head;

            while (currentPosition < position - 1) {
                currentPosition++;
                currentNode = currentNode.next;
            }

            if (currentNode == null) {
                System.out.println("invalid position");
                return;
            }

            currentNode.next = currentNode.next.next;
            size--;
        }
    }

    // returns -1 if not found and position of node if found
    public int find(int value) {
        if (head == null) {
            return -1;
        }

        Node currentNode = this.head;
        int position = 1;

        while (currentNode != null) {
            if (currentNode.data == value) {
                return position;
            }

            currentNode = currentNode.next;
            position++;
        }

        return -1;
    }

    public void reverse() {
        if (this.head == null) {
            return;
        }

        Node previousNode = null;
        Node currentNode = this.head;
        Node nextNode;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head = previousNode;
    }

    //returns middle node
    public int findMid() {
        if (head == null) {
            return -1;
        }

        if (head.next == null) {
            return head.data;
        }

        Node slowPointer = this.head;
        Node fastPointer = this.head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer.data;
    }

    // returns the n th node from end
    public int findNthElementFromEnd(int n) {
        if (this.head == null || this.head.next == null) {
            return -1;
        }

        Node previousNode = this.head;
        Node currentNode = this.head;
        int count = 0;

        while (count < n) {
            currentNode = currentNode.next;
            count++;
        }

        while (currentNode != null) {
            currentNode = currentNode.next;
            previousNode = previousNode.next;
        }

        return previousNode.data;
    }

    // removes duplicate from sorted singly linked list
    public void removeDuplicate() {
        Node currentNode = this.head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.data == currentNode.next.data) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(JavaString[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.insertLast(10); //10 --> null
//        singlyLinkedList.insertLast(20); //10 --> 20 --> null
//        singlyLinkedList.insertLast(30); //10 --> 20 --> 30 --> null
//        singlyLinkedList.insertFirst(5); //5 --> 10 --> 20 --> 30 --> null
//        singlyLinkedList.insert(40, 3); //5 --> 10 --> 40 --> 20 --> 30 --> null
//        singlyLinkedList.deleteFirst(); //10 --> 40 --> 20 --> 30 --> null
//        singlyLinkedList.deleteLast(); //10 --> 40 --> 20 --> null
//        singlyLinkedList.insertLast(50); //10 --> 40 --> 20 --> 50 --> null
//        singlyLinkedList.delete(2); //10 --> 20 --> 50 --> null
//        singlyLinkedList.reverse(); //50 --> 20 --> 10 --> null
//        singlyLinkedList.insertLast(60); //50 --> 20 --> 10 --> 60 --> null
//
//        singlyLinkedList.print();
//        System.out.println("Mid: " + singlyLinkedList.findMid());
//        System.out.println("Second last: " + singlyLinkedList.findNthElementFromEnd(2));
//        System.out.println("Third last: " + singlyLinkedList.findNthElementFromEnd(3));
//        System.out.println("\nLength of singly linked list is ".concat(JavaString.valueOf(singlyLinkedList.length())));
//        System.out.println("\nLength of singly linked list is ".concat(JavaString.valueOf(singlyLinkedList.size)));
//        System.out.println("Position of 20 in singly linked list is: " + singlyLinkedList.find(20));


        singlyLinkedList.insertLast(10);
        singlyLinkedList.insertLast(10);
        singlyLinkedList.insertLast(10);
        singlyLinkedList.insertLast(20);
        singlyLinkedList.insertLast(20);
        singlyLinkedList.insertLast(30);
        singlyLinkedList.insertLast(40);
        singlyLinkedList.removeDuplicate();
        singlyLinkedList.print();
    }
}

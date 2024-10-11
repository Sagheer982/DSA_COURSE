class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task2 {
    Node head;

    public Task2() {
        this.head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void sort() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }

        Node current, nextNode;
        boolean swapped;
        do {
            current = head;
            nextNode = head.next;
            swapped = false;
            while (nextNode != null) {
                if (current.data > nextNode.data) {
                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                    swapped = true;
                }
                current = nextNode;
                nextNode = nextNode.next;
            }
        } while (swapped);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Task2 list = new Task2();
        list.addNode(50);
        list.addNode(40);
        list.addNode(30);
        list.addNode(20);
        list.addNode(10);

        System.out.println("Original List:");
        list.printList();

        list.sort();
        System.out.println("Sorted List:");
        list.printList();
    }
}

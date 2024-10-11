public class Task_4_CLL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            newNode.next = head;
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head.next == head) {
            head = null;
            size--;
            return;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            head = head.next;
            current.next = head;
            size--;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == head) {
            head = null;
            size--;
        } else {
            Node current = head;
            Node prev = null;
            while (current.next != head) {
                prev = current;
                current = current.next;
            }
            prev.next = head;
            size--;
        }
    }

    public void printCLL() {
        if (head == null)
            System.out.println("Circular Linked List is empty.");
        else {
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task_4_CLL obj = new Task_4_CLL();

        obj.addFirst(2);
        obj.addFirst(1);
        obj.addLast(3);
        obj.addLast(4);
        obj.printCLL();
        System.out.println();
        obj.removeFirst();
        obj.printCLL();
        System.out.println();
        obj.removeLast();
        obj.printCLL();
    }
}


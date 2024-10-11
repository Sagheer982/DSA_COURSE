public class Task_3GS <T> {
    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(T data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(T data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head == tail) {
            head = tail = null;
            size--;
            return;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            Node secondLast = head;
            for (int i = 0; i < size - 2; i++) {
                secondLast = secondLast.next;
            }
            secondLast.next = null;
            tail = secondLast;
            size--;
        }
    }

    public void printLL() {
        if (head == null)
            System.out.println("List is Empty");

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
    	Task_3GS <String> obj = new Task_3GS<>();

        obj.addFirst("Muhammad");
        obj.addFirst("Sagheer");
        obj.addLast("Malik");
        obj.addLast("Star");
        obj.printLL();
        System.out.println();
        obj.removeFirst();
        obj.printLL();
        System.out.println();
        obj.removeLast();
        obj.printLL();
    }
}

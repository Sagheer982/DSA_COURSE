public class Task_2d <T> {
    class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(T data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
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
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is Empty");
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is Empty");
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
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
    	Task_2d <Integer> obj = new Task_2d<>();

        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addLast(4);
        obj.addLast(5);

        obj.printLL();
        System.out.println();

        obj.removeFirst();
        obj.removeLast();
        obj.removeLast();
		
		obj.printLL();

	}

}

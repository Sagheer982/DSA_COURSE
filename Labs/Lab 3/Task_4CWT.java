public class Task_4CWT {
	    class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head;
	    Node tail;
	    int size = 0;

	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        size++;

	        if (head == null) {
	            head = tail = newNode;
	            tail.next = head; // Make it circular
	        } else {
	            newNode.next = head;
	            head = newNode;
	            tail.next = head; // Update tail's next to maintain the circular connection
	        }
	    }

	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        size++;

	        if (head == null) {
	            head = tail = newNode;
	            tail.next = head; // Make it circular
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; // Update tail's next to maintain the circular connection
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
	            tail.next = head; // Update tail's next to maintain the circular connection
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
	            Node current = head;
	            while (current.next != tail) {
	                current = current.next;
	            }
	            tail = current;
	            tail.next = head; // Update tail's next to maintain the circular connection
	            size--;
	        }
	    }

	    public void printCLL() {
	        if (head == null)
	            System.out.println("Circular Linked List is empty.");

	        Node current = head;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Task_4_CLLWT obj = new Task_4_CLLWT();

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

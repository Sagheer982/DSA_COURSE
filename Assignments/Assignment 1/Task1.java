class Node {
    int data;
    Node next;


    // 
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task1 {
    Node head;

    public Task1() {
        this.head = null;
    }

    public int nthFromLast(int n) {
        if (head == null) {
            return -1;
        }

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1;
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public static void main(String[] args) {
     Task1 list = new Task1();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);

        int n = 2;
        int result = list.nthFromLast(n);

        if (result != -1) {
            System.out.println("The " + n + "th node from the end is: " + result);
        } else {
            System.out.println("The list is too short.");
        }
    }
}

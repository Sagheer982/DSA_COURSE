class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task4 {
    Node head;
    public void addNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void removeDuplicate() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Task4 nn = new Task4();
        nn.addNode(5);
        nn.addNode(3);
        nn.addNode(4);
        nn.addNode(5);
        nn.addNode(2);
        nn.addNode(1);
        nn.addNode(4);
        nn.addNode(5);
        nn.addNode(3);
        
        System.out.println("Original list:");
        nn.printlist();
        
        nn.removeDuplicate();
        
        System.out.println("List after removing duplicates:");
        nn.printlist();
    }
}

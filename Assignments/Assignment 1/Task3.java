class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task3 {
    Node head;
    public Node addfirst(int data, Node head) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        return head;
    }

    public Node reverselist(Node head) {
        if (head == null) return null;
        
        Node head2 = null;
        Node temp = head;
        
        while (temp != null) {
            head2 = addfirst(temp.data, head2); 
            temp = temp.next;
        }
        
        return head2;
    }

    public void printlist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Task3 task = new Task3();
        task.head = task.addfirst(10, task.head);
        task.head = task.addfirst(20, task.head);
        task.head = task.addfirst(30, task.head);
        task.head = task.addfirst(40, task.head);
        task.head = task.addfirst(50, task.head);
        
        System.out.println("Original List:");
        task.printlist(task.head);
        
        Node reversedhead = task.reverselist(task.head);
        System.out.println("Reversed List:");
        task.printlist(reversedhead);
    }
}

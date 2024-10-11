class Node<T> {
    T data;          
    Node<T> next;    

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Main<T> {
    private Node<T> head;  

    public Main() {
        this.head = null;
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;  
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode; 
        }
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;  
        head = newNode;       
    }

    public void deleteNode(T key) {
        Node<T> current = head;
        Node<T> previous = null;

        if (current != null && current.data.equals(key)) {
            head = current.next; 
            return;
        }

        while (current != null && !current.data.equals(key)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key " + key + " not found.");
            return;
        }

        previous.next = current.next;
    }

    public void display() {
        Node<T> current = head;

        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " , ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Generic {
    public static void main(String[] args) {
        // For Integer LinkedList
        Main<Integer> intList = new Main<>();
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtBeginning(5);
        intList.display();  

        intList.deleteNode(10);
        intList.display();  

        // For String LinkedList
        Main<String> stringList = new Main<>();
        stringList.insertAtEnd("Alex");
        stringList.insertAtEnd("Sagheer");
        stringList.insertAtBeginning("Alaan");
        stringList.display();  

        stringList.deleteNode("Alex");
        stringList.display();  
    }
}

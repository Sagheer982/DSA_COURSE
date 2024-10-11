class Node {
    String name;
    Node prev, next;
    Node (String name)
    {
        this.prev = null;
        this.next = null;
        this.name = name;
    }
}
class DoubleLinkedList {
    Node head;
    public boolean isEmpty() {
        if(head==null) {
            return head==null;
        }
        return false;
    }
    // Add node with name in beginning of linkedlist, name as parameter
    public void insertAtBeginning(String name)
    {
        Node node = new Node(name);
        if(isEmpty())
            head=node;
        else {
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    // Add node in beginning of linkedlist, node as parameter
    public void insertAtBeginning(Node node)
    {
        if(isEmpty())
            head=node;
        else {
            node.next=head;
            head.prev=node;
            head=node;

        }
    }
    // Add node in end of linkedlist, name as parameter
    public void insertAtEnd(String name)
    {
        Node node=new Node(name);
        if(isEmpty())
            head=node;

        else {
            Node temp=head;

            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }
    }
    // Add node in end of linkedlist, node as parameter
    public void insertAtEnd(Node node)
    {
        if(isEmpty())
            head=node;
        else {
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }
    }
    // Add node after name which is provided as param , name and node as params
    public void insertAfterName(String name, Node node) {
        Node current = head;
        while (!current.name.equals(name)) {
            current = current.next;
        }
        if (current != null) {
            node.next = current.next;
            node.prev = current;
            if (current.next != null) {
                current.next.prev = node;
            }
            current.next = node;
        }
    }

    // Add node before name which is provided as param , name

    public void insertBeforeName(String targetName, Node newNode) {
        Node current = head;
        while (!current.name.equals(targetName)) {
            current = current.next;
        }
        if (current != null) {
            newNode.prev = current.prev;
            if (current.prev != null) {
                current.prev.next = newNode;
            } else {
                head = newNode; // If inserting before the head
            }
            current.prev = newNode;
            newNode.next = current;
        }
    }

    // Make double linkedlist as Circular Double LinkedList
    public void makeCircular()
    {
        Node temp=head;
        while(temp!=null) {
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
    }
    // Print all the nodes in linkedlist, make sure it works on circular double linkedlist
    public void printAll() {
        if(head==null)
            System.out.println("List is Empty");

        Node currNode = head;
        while(currNode!=null) {
            System.out.print(currNode.name + " ");
            currNode = currNode.next;
        }
    }

}
public class Task_1{

    public static void main(String[] args) {
        DoubleLinkedList obj = new DoubleLinkedList();
        Node node=new Node("Alaan");
        obj.insertAtBeginning(node);
        Node node2=new Node("Sagheer");
        obj.insertAtBeginning(node2);
        Node node3=new Node("Alex");
        obj.insertAfterName("Sagheer", node3);
        Node node4 = new Node("Jon");
        obj.insertBeforeName("Sagheer", node4);

        obj.printAll();

    }

}

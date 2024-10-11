import java.util.Stack;

interface List {
    public boolean isEmpty();
    public int size();
    public void add(int item);
    public void add(int index, int item);
    public void remove(int index);
    public void removeitem(int item);
    public List duplicate();
    public List duplicateReversed();
}

class LinkedList implements List {

    class Node {
        int data;
        Node next;

        public Node() {
            this.next = null;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    int size;

    public LinkedList() {
        head = new Node(); 
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(int data) {
        Node newnode = new Node(data);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        size++;
    }

    public void add(int index, int data) {
        if (index < 1 || index > size + 1) { 
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        Node newnode = new Node(data);
        Node temp = head;

        for (int i = 1; i < index; i++) { 
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    public void remove(int index) {
        if (index < 1 || index > size) { 
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        Node temp = head;
        for (int i = 1; i < index; i++) { 
            temp = temp.next;
        }
        Node toRemove = temp.next; 
        if (toRemove != null) {
            temp.next = toRemove.next; 
            toRemove = null; 
        }
        size--;
    }

    public void removeitem(int data) {
        Node temp = head;
        Node temp2 = temp.next;

        while (temp2 != null && temp2.data != data) {
            temp = temp2;
            temp2 = temp2.next;
        }

        if (temp2 != null) {
            temp.next = temp2.next; 
            temp2 = null; 
            size--;
        }
    }

    public List duplicate() {
        LinkedList newList = new LinkedList();
        Node currentNode = head.next;

        while (currentNode != null) {
            newList.add(currentNode.data);
            currentNode = currentNode.next;
        }

        return newList;
    }

    public List duplicateReversed() {
        LinkedList reversedList = new LinkedList();
        Node currentNode = head.next;

        Stack<Integer> stack = new Stack<>();
        while (currentNode != null) {
            stack.push(currentNode.data);
            currentNode = currentNode.next;
        }

        while (!stack.isEmpty()) {
            reversedList.add(stack.pop());
        }

        return reversedList;
    }

    public void printList() {
        Node currNode = head.next;
        while (currNode != null) {
            System.out.print(currNode.data + "  ");
            currNode = currNode.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Size: " + size() + "  ");
        Node temp = head.next;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }
}

public class Task_3 {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        obj.printList();

        obj.remove(1);
        obj.removeitem(5);

        System.out.println();
        
        System.out.println(obj); 
    }
}

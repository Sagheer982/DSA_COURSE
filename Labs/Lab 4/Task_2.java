class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Task_22 {
    private Node top;
    private int size;

    public Task_22() {
        this.top = null;
        this.size = 0;
    }

    public void push(int x) {
        Node newnode = new Node(x);
        if (isEmpty()) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
        size++;
        System.out.println("Inserting " + x);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;  // Fixing the typo
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        System.out.println("Removing " + data);
        return data;
    }

    public int size() {
        return size;
    }
}

public class Task_2{
    public static void main(String args[]) {
        Task_22 nn = new Task_22();  // Fixed parentheses for instantiating the object

        nn.push(1);
        nn.push(2);  // Changed to push different values to track the stack's behavior
        nn.pop();
        nn.pop();
        nn.push(3);

        System.out.println("Top element is: " + nn.top());
        System.out.println("Stack size is: " + nn.size());

        nn.pop();

        if (nn.isEmpty()) {
            System.out.println("Stack is Empty");
        }
    }
}

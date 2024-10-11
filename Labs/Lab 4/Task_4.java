class Node {
    int data; 
    Node next; 

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node rear = null, front = null;  

   
    public int dequeue() {
        
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = front.data;
        front = front.next;

        
        if (front == null) {
            rear = null;
        }

        System.out.println("Removing " + result);
        return result;
    }

    
    public void enqueue(int item) {
        
        Node newnode = new Node(item);

        System.out.println("Inserting " + item);

       
        if (isEmpty()) {
            front = rear = newnode;
            return;
        }

       
        rear.next = newnode;
        rear = newnode;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }
    public boolean isEmpty() {
        return front == null;
    }
}

public class Task_4 {
    public static void main(String[] args) {
        Queue q = new Queue();  
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("Front element is " + q.peek());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }
}

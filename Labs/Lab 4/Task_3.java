class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
        count = 0;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty ");
            return -1;
        }
        int result = arr[front];
        System.out.println("Removing " + result);
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % capacity;
        }
        count--;
        return result;
    }

    public void Enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            System.out.println("Inserting " + item);
            count++;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}

public class Task_3 {
    public static void main(String args[]) {
        Queue q = new Queue(5);

        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);

        System.out.println("Front element is: " + q.peek());

        q.dequeue();

        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is: " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is not Empty");
        }
    }
}

import java.util.Stack;
class Task_5 {
    private Stack<Integer> s1, s2;

    Task_5() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Enqueue an item to the queue
    public void enqueue(int data) {
        // Push the element into the first stack (s1)
        s1.push(data);
        System.out.println("Inserting " + data);
    }

    // Dequeue an item from the queue
    public int dequeue() {
        // If both stacks are empty, the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // If s2 is empty, move all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Pop the top item from s2
        int result = s2.pop();
        System.out.println("Removing " + result);
        return result;
    }

    // Utility function to check if the queue is empty
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};
        Task_5 q = new Task_5();

        // Enqueue the elements
        for (int key : keys) {
            q.enqueue(key);
        }

        // Dequeue the elements
        System.out.println(q.dequeue());  // print 1
        System.out.println(q.dequeue());  // print 2
    }
}

import java.util.LinkedList;
import java.util.Queue;

class Task_6 {
    private Queue<Integer> q1, q2;
    public Task_6() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int data) {
        
        q1.add(data);
        System.out.println("Pushing " + data);
    }

    
    public int pop() {
        
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int result = q1.remove();
        System.out.println("Popping " + result);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return result;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

       
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int result = q1.peek();
        q2.add(q1.remove()); 

        
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return result;
    }

  
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Task_6 stack = new Task_6();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is " + stack.top());  

        stack.pop();  
        stack.pop();  

        System.out.println("Top element is " + stack.top());  

        stack.pop();  
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        }
    }
}

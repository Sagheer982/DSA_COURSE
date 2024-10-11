class Task_1
{
    private int arr[];
    private int top;
    private int capacity;
    
    Task_1(int size) 
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    public void push(int x)
    {
        if (top < capacity - 1) { 
            top++;
            arr[top] = x;
            System.out.println("Inserting " + x);
        }
        else {
            System.out.println("Stack is full");
        }
    }
    
    public int pop()
    {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Removing " + arr[top]);
        return arr[top--];
    }
    
    public int top()
    {
        return arr[top];
    }
    
    public int size()
    {
        return top + 1;
    }
    
    public Boolean isEmpty()
    {
        return top == -1;
    }
    
    public Boolean isFull()
    {
        return top == capacity - 1;
    }
    
    public static void main(String[] args)
    {
        Task_1 stack = new Task_1(3); 
        stack.push(1); 
        stack.push(2); 
        stack.pop(); 
        stack.pop(); 
        stack.push(3); 
        System.out.println("Top element is: " + stack.top());
        System.out.println("Stack size is " + stack.size());
        stack.pop(); 
        
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}

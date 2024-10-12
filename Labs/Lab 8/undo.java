import java.util.Scanner;
class UndoRedoManager {
    public static class Node {  // Made this class static
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {  // Made this class static
        Node top;

        boolean isEmpty() {
            return top == null;
        }

        void push(String data) {
            Node node = new Node(data);
            node.next = top;
            top = node;
        }

        String pop() {
            if (isEmpty()) {
                return null;
            }
            String data = top.data;
            top = top.next;
            return data;
        }
    }

    static Stack undoStack = new Stack();
    static Stack redoStack = new Stack();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease enter your choice:");
            System.out.println("1. Insert");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Stack");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Input: ");
                    String data = scanner.nextLine();
                    insert(data);
                    break;
                case 2:
                    System.out.println(undo());
                    break;
                case 3:
                    System.out.println(redo());
                    break;
                case 4:
                    display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void insert(String data) {
        undoStack.push(data);
        redoStack = new Stack();
    }

    static String undo() {
        if (undoStack.isEmpty()) {
            return "Undo Unsuccessful";
        }
        String data = undoStack.pop();
        redoStack.push(data);
        return "Undo successful";
    }

    static String redo() {
        if (redoStack.isEmpty()) {
            return "Redo Unsuccessful";
        }
        String data = redoStack.pop();
        undoStack.push(data);
        return "Redo Successful";
    }

    static void display() {
        System.out.print("Undo Stack: ");
        Node temp = undoStack.top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

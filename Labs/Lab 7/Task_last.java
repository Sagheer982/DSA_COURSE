public class Task_last {

   
    public void printasc(int start, int end) {
        
        if (start > end) {
            return;
        }
        System.out.print(start + " ");
        printasc(start + 1, end);
    }
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        Task_last obj = new Task_last();
        System.out.println("Ascending Order  ");
        obj.printasc(start, end);
        
    }
}

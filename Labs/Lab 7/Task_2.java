
public class Task_2 {

    public static void printarray(char array[], int size) {
            
            if(size>=0) {
                System.out.print(array[size] + " " );
                printarray(array,size - 1);
                System.out.print(array[size]  );
            }
            
        }
        public static void main(String[] args) {
            
            System.out.println("Reverse order  /Forward = ");
            char array[]= {'S','a','g','h','e','e','r'};
            
            Task_2.printarray(array,6);
    
        }
    
    }
    
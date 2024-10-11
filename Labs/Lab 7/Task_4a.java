import java.util.Scanner;
public class Task_4a { 

    static void genseries(int num) {
        int f_term = 0;
        int s_term = 1;
        int n_term = 0;
        
        for (int i = 0; i < num; i++) {
            System.out.print(f_term + " ");
            
            n_term = f_term + s_term;
            f_term = s_term;
            s_term = n_term;
        }
    }
    
    public static void main(String[] args) {
        long s_time = System.currentTimeMillis();
        
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number for Fibonacci series");
        num = obj.nextInt();
        
        genseries(num);

        long e_time = System.currentTimeMillis();
        
        System.out.println();
        System.out.println("Duration Time in Millis " + (e_time - s_time));
    }

}

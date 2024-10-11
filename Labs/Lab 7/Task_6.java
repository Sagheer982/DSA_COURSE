
import java.util.Scanner;

public class Task_6{

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
    	long s_time = System.currentTimeMillis();
    	
    	Scanner obj = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers to check GCD");
        a = obj.nextInt();
        b = obj.nextInt();

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
        
        
        long e_time = System.currentTimeMillis();
		System.out.println("Duration Time in Millis " + (e_time - s_time));

    
    }
}

import java.util.Scanner;
public class Task_5b {
	
	static int a = 1;
	
	static int factorial(int num) {
		if(num>=1) {
			a = a*(num);
			factorial(num-1);
		}
		return a;
	}

	public static void main(String[] args) {
		
		long s_time = System.currentTimeMillis();
		
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number");
		num = obj.nextInt();
		
		int a = factorial(num);
		
		System.out.println(a);
		
		long e_time = System.currentTimeMillis();
		System.out.println("Duration Time in Millis " + (e_time - s_time));

	}

}

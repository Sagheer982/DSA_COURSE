import java.util.Scanner;
public class Task_5 {
	
	static void factorial(int num) {
		int a = 1;
		
		for(int i=1;i<=num;i++) {
			a = a*i;
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
	
		long s_time = System.currentTimeMillis();
		
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number");
		num = obj.nextInt();
		
		factorial(num);
		
		long e_time = System.currentTimeMillis();
		System.out.println("Duration Time in Millis " + (e_time - s_time));

	}

}

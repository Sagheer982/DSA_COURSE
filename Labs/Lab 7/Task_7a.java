import java.util.Scanner;
public class Task_7a {
	
	static int checknumber(int a , int array[]) {
		for(int i=0;i<10;i++) {
			if(array[i]==a) {
				return a;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		long s_time = System.currentTimeMillis();
		
		Scanner obj = new Scanner(System.in);
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int a;
		System.out.println("enter any number to check");
		a = obj.nextInt();
		
		int b = checknumber(a , array);
		
		if(a==b) {
			System.out.println("yes this number is in array");
		}
		else {
			System.out.println("no this number is not in array");
		}
		
		long e_time = System.currentTimeMillis();
		
		System.out.println("Duration Time in Millis " + (e_time - s_time)); 

	}

}

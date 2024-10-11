import java.util.Scanner;
public class Task_4b {
	
	static int genseries(int num) {
		
		if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return genseries(num - 1) + genseries(num - 2);
        }
	}

	public static void main(String[] args) {
		
		long s_time = System.currentTimeMillis();
		
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter any number for fabonacci series");
		num = obj.nextInt();
		
		for (int i = 0; i < num; i++) {
            System.out.print(genseries(i) + " ");
        }
		
		long e_time = System.currentTimeMillis();

		System.out.println();
		System.out.println("Duration Time in Millis " + (e_time - s_time));
	}

}

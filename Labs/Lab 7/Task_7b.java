import java.util.Scanner;
public class Task_7b {
	
	static int checknumber(int array[], int num, int indx) {
		
		if(indx==array.length) {
			return -1;
			
		}
	   if(array[indx]==num) {
			return 1;
		}
	 
	   return checknumber(array,num,indx+1);
		
	}

	public static void main(String[] args) {
		
	    long s_time = System.currentTimeMillis();
		
		Scanner obj = new Scanner(System.in);
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int a;
		System.out.println("enter any number to check");
		a = obj.nextInt();
		
		System.out.println(checknumber(array , a , 0));
		
		long e_time = System.currentTimeMillis();
		
		System.out.println("Duration Time in Millis " + (e_time - s_time));
	}

}

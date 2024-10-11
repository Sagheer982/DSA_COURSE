public class Task_1 {	
	public static void printnumber(int num) {
		
		if(num>0) {
			System.out.print(num + " " );
			printnumber(num - 1);
			
		}
		
	}
	public static void main(String[] args) {	
        System.out.println("Descending Order");
         Task_1.printnumber(10);
	}
}

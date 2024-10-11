public class Task_3 {
	public char firstSingleLetter (char text [], int n) {
		char a = 0;
		int b = 0;
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				if(text[i]==text[j]) {
					b++;
				}
			}
			if(b>1) {
				b=0;
			}
			else if(b==1) {
				a = text[i];
				break;
			}	
		}
		return a;
	}	
	public static void main(String[] args) {
		
		Task_3 obj = new Task_3();
		char array[]= {'a','l','g','o','r','i','t','h','m'};
        System.out.println("algorithm");
		System.out.println(obj.firstSingleLetter(array, array.length));
	}
}

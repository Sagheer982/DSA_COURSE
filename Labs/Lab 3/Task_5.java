public class Task_5 {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}	
	}
	
	static Node head;
	
	public static void detectCycle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				System.out.println("Cycle is Exist in the List.");
				break;
			}
			else if(fast == null || fast.next == null) {
				System.out.println("Cycle is not Exist in the List.");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next;
		
		detectCycle(head);
		
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		detectCycle(head);

	}

}

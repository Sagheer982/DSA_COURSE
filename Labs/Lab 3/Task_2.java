public class Task_2 {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}	
	}
	Node head;
	Node tail;
	int size=0;
	
	public void addFirst(int data) {
		Node newnode = new Node(data);
		size++;
		
		if(head==null) {
			head = tail = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	public void addLast(int data) {
		Node newnode = new Node(data);
		size++;
		
		if(head==null) {
			head = tail = newnode;
		}
		else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	public void removeFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else if(head == tail) {
			head = tail = null;
			size--;
			return;
		}
		else {
			head = head.next;
			size--;
		}
	}
	
	public void removeLast() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else if(head == tail) {
			head = tail = null;
			size--;
		}
		else {
			Node secondlast=head;
			for(int i=0; i<size-2;i++) {
				secondlast = secondlast.next;
			}
			secondlast.next = null;
			tail = secondlast;
		}
		
	}
	
	
	public void printLL() {
		if(head==null)
			System.out.println("List is Empty");
		
		Node currNode = head;		
		while(currNode!=null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	

	public static void main(String[] args) {
		
		Task_2 obj = new Task_2();
		
		obj.addFirst(2);
		obj.addFirst(1);
		obj.addLast(3);
		obj.addLast(4);
		obj.printLL();
		System.out.println();
		obj.removeFirst();
		obj.printLL();
		System.out.println();
		obj.removeLast();
		obj.printLL();
		

	}

}

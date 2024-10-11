public class Task_6b {

	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node currNode = head;
		
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;				
	}
	
	public void printlist(Node head) {
		if(head!=null) {	
			System.out.print(head.data + " ");
			printlist(head.next);
		}
	}
	
	public Node getNode() {
		return head;
	}
	public static void main(String[] args) {
	
		long s_time = System.currentTimeMillis();
		
		Task_6b obj = new Task_6b();
		
		obj.addLast(1);
		obj.addLast(2);
		obj.addLast(3);
		obj.addLast(4);
		obj.addLast(5);
		
		obj.printlist(obj.getNode());
		
		System.out.println();
		long e_time = System.currentTimeMillis();
		System.out.println("Duration Time in Millis " + (e_time - s_time));

		
	}

}

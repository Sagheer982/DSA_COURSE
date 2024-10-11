
public class Reverse {

	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	public void printList() {
		if(head==null)
			System.out.println("List is Empty");
		
		Node currNode = head;		
		while(currNode!=null) {
			System.out.print(currNode.data + "  ");
			currNode = currNode.next;
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
	
	public Node get() {
		return head;
	}
	public Node makeReverse(Node n) {
		Node prev=null;
		Node current = n;
		Node next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse obj = new Reverse();
		
		obj.addLast(1);
		obj.addLast(2);
		obj.addLast(3);
		obj.addLast(4);
		obj.addLast(5);
		
		obj.printList();
		
		System.out.println();

		obj.makeReverse(obj.get());
		
		obj.printList();
		
	}

}

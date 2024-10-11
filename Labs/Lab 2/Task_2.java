class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Task_2{

    Node head;
    int size=0;

    public void addFirst(int data) {
        Node newNode=new Node(data);
        size++;

        if(head==null) {
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;


    }

    public void printList() {
        if(head==null)
            System.out.println("The List is Empty");

        Node currNode = head;
        while(currNode!=null) {
            System.out.print(currNode.data + "  ");
            currNode = currNode.next;
        }
    }




    public static void main(String[] args) {
        

        Task_2 list=new Task_2();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(4);
        list.printList();

        System.out.println();
        System.out.println("Size of list is " + list.size);



    }

}
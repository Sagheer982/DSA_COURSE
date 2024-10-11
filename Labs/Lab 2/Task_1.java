class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

} 
public Node head;
 void addFirst(int data){
    Node newnode =new Node(data);
      newnode.next=head;
      head=newnode;

 }
 void addlast(int data){
    Node newnode =new Node(data);
           if(head==null){
            head = newnode;
           }
           else{
            Node temp=head;
            while(temp!=null){
                temp=temp.next;

            }
            temp.next=newnode;
           }
 }
  public void  search(int data){
    Node temp=head;
    while(temp!=null){
        if(temp.data == data){
            System.out.println(dat + " is Found ");
            return ;
        }
        temp = temp.next;
    }
    System.out.println(data + " not Found ");
  }
  public display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
  }

class Task_1{
           public static void main(String args[]){
            Task_1 ll =new Task_1();
            ll.addFirst(40);
            ll.addFirst(55);
            ll.addlast(6);
            ll.addlast(89);
            ll.display();
            ll.search(6);
           }
}
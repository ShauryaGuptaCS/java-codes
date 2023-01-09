public class CircularLinkedList {

    class Node{
        int data;
        Node next;
        Node(int value){
            this.data=value;
            this.next=null;
        }
    }
    Node head=null;
    void addFirst(int value){
        Node NewNode=new Node(value);
        if(head==null){
            head=NewNode;
            head.next=head;
            return;
        }
        Node current=head.next;
        Node ptr;
        if(head.next==head){
            ptr=head;
            head=NewNode;
            head.next=ptr;
            ptr.next=head;
        }
        while(current!=head){
            current=current.next;
        }
        current.next=NewNode;
        NewNode.next=head;
        head=NewNode;
    }
    void printList(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node current=head.next;
        if(current==head){
            System.out.println(head.data+"->"+current.data);
            return;
        }
        while(current!=head){
            System.out.print(current.data+"->");
        }
        System.out.println(current.data);
        return;
    }
    public static void main(String[] args) {
        CircularLinkedList ob=new CircularLinkedList();
        ob.addFirst(5);
        ob.printList();
        ob.addFirst(10);
        ob.printList();
    }
}

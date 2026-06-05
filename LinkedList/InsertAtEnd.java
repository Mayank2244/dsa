package LinkedList;


public class InsertAtEnd {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static Node InsertAtEnd(Node head,int val){
        Node newnode=new Node(val);
        Node temp=head;
        if(head == null){
            return newnode;
        }
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(3);

        Node c=new Node(123);

        Node d=new Node(193);
        a.next=b;
        b.next=c;
        c.next=d;
        Node head=a;
        System.out.println("before");
        display(head);
        head=InsertAtEnd(head,4);
        display(head);



    }
}


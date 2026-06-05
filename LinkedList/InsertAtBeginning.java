package LinkedList;
import java.util.*;


public class InsertAtBeginning {
   static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static Node insetAtbegin(Node head,int val){
        Node temp= new Node(val);
        temp.next=head;
        return temp;
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
        Node a=new Node(112);
        Node b=new Node(12);
        Node c=new Node(22);
        Node d=new Node(122);
        Node e=new Node(124);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        Node head=a;
        System.out.println("before");
        display(head);

        head=insetAtbegin(head,12324);
      //  insertAtbegin();
        System.out.println("after");
  display(head);
    }
}

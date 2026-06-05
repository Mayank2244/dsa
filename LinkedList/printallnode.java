package LinkedList;
import java.util.*;
class Node{
    int val;
    Node next;
Node(int val){
    this.val=val;
    this.next=null;
}
}



public class printallnode
{
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            return;
        }
        Node head=new Node(sc.nextInt());
        Node tail=head;
        for(int i=2;i<=n;i++){
            System.out.println(i);
            Node newnode= new Node(sc.nextInt());
            tail.next=newnode;
            tail=newnode;
        }

     display(head);




   }
}

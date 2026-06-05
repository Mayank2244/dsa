
class basicLL{
   static class Node{
        int val;
        Node next;

        //Construction
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
   public static void main(String[] args) {



       Node a=new Node(10);
       Node b=new Node(120);
       Node c=new Node(130);
       Node d=new Node(230);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=null;
       System.out.println(a.val);
       System.out.println(b);

       System.out.println(c);
       System.out.println(d.val);

   }
}
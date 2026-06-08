package LinkedList;

public class reverse {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node rev(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node pre = head;
        Node curr = head.next;

        while (curr != null) {
            Node newN = curr.next;
            curr.next = pre;
            pre = curr;
            curr = newN;
        }

        head.next = null;

        return pre;
    }
/// using resursion
    public Node revrecursion(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newhead=revrecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        reverse rs = new reverse();

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        Node head = a;

        System.out.println("Before Reverse:");
        rs.display(head);

        head = rs.rev(head);

        System.out.println("After Reverse:");
        rs.display(head);
        head=rs.revrecursion(head);
        System.out.println("recursion");
        rs.display(head);
    }
}

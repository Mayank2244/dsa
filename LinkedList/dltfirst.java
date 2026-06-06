package LinkedList;

public class dltfirst {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Delete First Node
    public static Node deleteFirst(Node head) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        return head.next;
    }

    // Delete Last Node
    public static Node deleteLast(Node head) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        Node secondlast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        return secondlast.next = null;


    }
    // Display Linked List
    public static void display(Node head) {

        if (head == null) {
            System.out.println("empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node a = new Node(12);
        Node b = new Node(14);
        Node c = new Node(5);
        Node d = new Node(132);
        Node e = new Node(145);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node head = a;

        System.out.println("Original List:");
        display(head);

        // Delete First
        head = deleteFirst(head);

        System.out.println("\nAfter Deleting First Node:");
        display(head);

        // Delete Last
        head = deleteLast(head);

        System.out.println("\nAfter Deleting Last Node:");
        display(head);
    }
}
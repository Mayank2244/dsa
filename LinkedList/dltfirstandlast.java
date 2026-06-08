package LinkedList;

public class dltfirstandlast {

    private int size;

    // Constructor
    dltfirstandlast() {
        this.size = 0;
    }

    // Node Class
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
            size++;
        }
    }

    // Delete First Node
    public Node deleteFirst(Node head) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        size--;
        return head.next;
    }

    // Delete Last Node
    public Node deleteLast(Node head) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
size--;
        // Only one node
        if (head.next == null) {

            return null;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            secondLast = secondLast.next;
            last = last.next;
        }

        secondLast.next = null;
        size--;

        return head;
    }

    // Display Linked List
    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        dltfirstandlast list = new dltfirstandlast();

        Node a = list.new Node(12);
        Node b = list.new Node(14);
        Node c = list.new Node(5);
        Node d = list.new Node(132);
        Node e = list.new Node(145);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node head = a;

        System.out.println("Original List:");
        list.display(head);
        System.out.println("Size = " + list.getSize());

        // Delete First Node
        head = list.deleteFirst(head);

        System.out.println("\nAfter Deleting First Node:");
        list.display(head);
        System.out.println("Size = " + list.getSize());

        // Delete Last Node
        head = list.deleteLast(head);

        System.out.println("\nAfter Deleting Last Node:");
        list.display(head);
        System.out.println("Size = " + list.getSize());
    }
}
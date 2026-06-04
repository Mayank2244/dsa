package LinkedList;

public class traverse {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void traverse(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);

        traverse(head);
    }
}

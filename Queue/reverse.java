package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> qt = new LinkedList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 1; i <= n; i++) {
            qt.add(sc.nextInt());
        }

        System.out.println("Original Queue: " + qt);

        reversequeue(qt);

        System.out.println("Reversed Queue: " + qt);

        sc.close();
    }

    private static void reversequeue(Queue<Integer> qt) {

        Stack<Integer> st = new Stack<>();

        // Queue -> Stack
        while (!qt.isEmpty()) {
            st.push(qt.remove());
        }

        // Stack -> Queue
        while (!st.isEmpty()) {
            qt.add(st.pop());
        }
    }
}
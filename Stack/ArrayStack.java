package Stack;

import java.util.*;

class ArrayStack1 {

    private int[] stackArray;
    private int capacity;
    private int topindex;

    public ArrayStack1(int size) {
        capacity = size;
        stackArray = new int[capacity];
        topindex = -1;
    }

    public ArrayStack1() {
        this(1000);
    }

    public void push(int x) {
        if (topindex >= capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++topindex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[topindex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[topindex];
    }

    public boolean isEmpty() {
        return topindex == -1;
    }
}

public class ArrayStack {

    public static void main(String[] args) {

        ArrayStack1 stack = new ArrayStack1();

        List<String> commands = Arrays.asList(
                "push",
                "push",
                "top",
                "pop",
                "isEmpty"
        );

        List<List<Integer>> inputs = Arrays.asList(
                Arrays.asList(5),
                Arrays.asList(10),
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList()
        );

        for (int i = 0; i < commands.size(); i++) {

            switch (commands.get(i)) {

                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;

                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;

                case "top":
                    System.out.print(stack.top() + " ");
                    break;

                case "isEmpty":
                    System.out.print(stack.isEmpty() + " ");
                    break;
            }
        }
    }
}

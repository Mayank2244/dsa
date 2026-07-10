package Queue;
import java.util.*;

public class traverse {
    private static void display(Queue<Integer> qt) {
        int n = qt.size();
        for (int i = 1; i <= n; i++) {
            System.out.print(qt.peek() + " ");
            qt.add(qt.remove());
        }
        System.out.println();

    }
    private static int peekAtIndex(Queue<Integer> qt, int idx) {
        int n = qt.size();
        if (idx < 0 || idx >= n) {
            System.out.println("Invalid Index");
            return -1;
        }
        // idx elements rotate karo
        for (int i = 1; i <= idx; i++) {
            qt.add(qt.remove());
        }
        // idx wala element dekh lo
        int ans = qt.peek();
        // order restore karo
        for (int i = 1; i <= n - idx; i++) {
            qt.add(qt.remove());
        }
        return ans;
    }


private static void removeidx( Queue<Integer> qt, int idx) {
    int n = qt.size();
    if (idx < 0 || idx >= n) {
        System.out.println("Invalid Index");
        return;
    }
    for (int i = 0; i < idx; i++) {
        qt.add(qt.remove());
    }
    qt.remove();
    for (int i = 0; i < n - idx - 1; i++) {
        qt.add(qt.remove());

    }
}


private static void addAtIndex(Queue<Integer> qt, int idx, int val) {
    if (idx < 0 || idx > qt.size()) {
        System.out.println("invalid");
        return;
    }
    int n = qt.size();
    if (idx < n) {
        for (int i = 1; i <= idx; i++) {
            qt.add(qt.remove());
        }
    }
    qt.add(val);
    for (int i = 1; i <= n - idx; i++) {
        qt.add(qt.remove());
    }

    }

    public static void main(String[] args) {
        Queue<Integer> qt = new LinkedList<>();
        qt.add(10);
        qt.add(20);
        qt.add(30);
        qt.add(40);
        display(qt);
        addAtIndex(qt, 2, 60);
        display(qt);
        removeidx(qt, 3);
        display(qt);
        //peekAtIndex(qt, 3);
        System.out.println(peekAtIndex(qt, 3));
        display(qt);
        //display(qt);
        //System.out.println(qt.size());
    }
}

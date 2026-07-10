package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basic {

    static void main() {
        Queue<Integer> qt = new LinkedList<>();
        qt.add(10);
        qt.add(20);
        qt.add(30);
        qt.add(40);
        System.out.println(qt.size());
        System.out.println(qt);

        System.out.println(qt.peek());
        qt.remove();
        System.out.println(qt);
    }
}

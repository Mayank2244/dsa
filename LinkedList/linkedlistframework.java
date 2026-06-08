package LinkedList;
import java.util.*;

 class linkedlistframework {

    public static void main(String[] args) {


        LinkedList<String> str = new LinkedList<String>();
        str.addFirst("Name");
        str.addFirst("My");
        System.out.println(str);
        str.addLast("is");
        str.addLast("Mayank");
        System.out.println(str);
        System.out.println(str.size());
        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i) + "->");
        }
        System.out.println("null");

        //delete first
        str.removeFirst();
        System.out.println(str);
        //delete last
        str.removeLast();
        System.out.println(str);
        //delete particular
        str.remove(1);
        System.out.println(str);
    }
}

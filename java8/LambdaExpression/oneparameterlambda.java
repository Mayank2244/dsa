package java8.LambdaExpression;

import java.util.ArrayList;

public class oneparameterlambda {
//    interface element{
//        void ele(int x);
//    }
//    public static void main(String[] args) {
//        element et = (int x) ->
//            System.out.println(x + 20);
//        et.ele(3);
//    }



   // with the help of collection frame work.
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println("all Element");
        arr.forEach(n-> System.out.println(n));
        System.out.println("even");
        arr.forEach(n-> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }

}

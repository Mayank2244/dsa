package java8;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface fun{
    int operation(int a,int b);
}
public class twoparameterlambda {
    public static void main(String[] args) {


        fun add = (a, b) -> a+b;
        fun multiply = (a, b) -> a * b;
        System.out.println(add.operation(6,9));
        System.out.println(multiply.operation(6,9));
    }


}

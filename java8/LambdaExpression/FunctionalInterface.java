//Interface having exactly one abstract method.
package java8;
interface absfun{
    void fun(int x);
    default void normalfun(){
        System.out.println("hell0");
    }

}

public class FunctionalInterface {
    public static void main(String[] args) {
        absfun s=(int x)-> System.out.println(2*x);
        s.fun(12);
    }
}

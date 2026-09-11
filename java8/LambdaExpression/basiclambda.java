package java8.Stream;
interface add {
    int addition(int a,int b);

        }
public class basiclambda {
    public static void main(String[] args) {
        add aa=(a,b)->a+b;
        int res=aa.addition(10,20);
        System.out.println(res);
    }
}

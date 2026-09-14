package java8.LambdaExpression;
interface sout {
    void print();
        }
public class zeroparameterLambda {
    public static void main(String[] args) {


        sout st =()-> System.out.println("zero parameter expression lamba");
        st.print();
    }
}

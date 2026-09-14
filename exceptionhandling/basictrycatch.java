//Exception handling in java is a mechianism used handle both
// runtime and compile time exception by using this is allow the progrma to continue.
package exceptionhandling;

public class basictrycatch {
    static void main(String[] args) {
        int n=10;
        int m=0;
        try {
            int ans=n/m;
            System.out.println(ans);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by 0!");

        }
    }
}

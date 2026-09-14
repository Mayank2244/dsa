// throw use to explicitly throw a single exception
// we use throw when something went wrong/ should not happen
// we want to stop normal flow and hand control to exception.
package exceptionhandling;
public class throwwww {
    static void checkage(int age) {
        if(age<18){
            throw new IllegalArgumentException("age must be 18 or above");
        }

    }
    public static void main(String[] args) {
        checkage(12);
    }
}

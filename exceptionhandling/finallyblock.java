// Finally block used after the try and catch in most situation,
// whether an expcetion arised or not
// it typically used for resources such as database connection,open files and network connections.
// finally may not execute in such as system.exit(),jvm crash,infinite loop.
package exceptionhandling;

public class finallyblock {
    public static void main(String[] args) {
        int[] arr={1,14,4,246};
        try{
            // this will give index out of bound like the size is 5 and we use to call arr of 6
            System.out.println(arr[6]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception"+e);
        }
        finally {
            System.out.println("this block always executes");
        }
        System.out.println("program  continue");
    }
}


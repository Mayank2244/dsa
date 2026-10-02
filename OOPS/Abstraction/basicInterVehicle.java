/*
An interface in java that define a contract
specify the behaviour implementing  classes
as expected to provide
it act as a 100 percent abstract contract


its primarly role used to achieve abstraction
and allow a class to implement multiple interface


 */
package OOPS.Abstraction;

import java.util.Vector;

interface Vehicle{
   void start();
}
class car implements Vehicle{

    @Override
    public void start() {
        System.out.println("car start with key");

    }
}
class bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("bike start with kick and slef start");
    }
}

public class basicInterVehicle {
    public static void main(String[] args) {
        car c=new car();
        c.start();
        bike b=new bike();
        b.start();
    }
}

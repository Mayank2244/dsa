package OOPS.Abstraction;
abstract class Payment{
    abstract void pay(double amount);
    void showrecipt(double amount){
        System.out.println("Payment recipt generated of:"+amount);
    }
}
class upi extends Payment{

    @Override
    void pay(double amount) {
        System.out.println("Paid"+" "+amount+" "+"using UPI");
    }
}
class card extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("paid"+" "+amount+ " "+"using Credit Card");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment u=new upi();
        Payment c=new card();
        double amount=1000.0;
        u.pay(amount);
        u.showrecipt(amount);
        c.pay(500);
        c.showrecipt(500);


    }
}

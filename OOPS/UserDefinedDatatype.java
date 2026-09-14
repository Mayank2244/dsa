package OOPS;

public class UserDefinedDatatype {
    public static class car{
        String company;
        String name;
        int seat;
        String type;
    }
    public static void main(String[] args) {
        car c1=new car();
        c1.company="Hyundai";
        c1.name="Verna";
        c1.seat=4;
        c1.type="seedan";
        System.out.println(c1.company);
        System.out.println(c1.name);
        System.out.println(c1.seat);
        System.out.println(c1.type);
        car c2=new car();
        c2.company="Hyundai";
        c2.name="Verna";
        c2.seat=4;
        c2.type="seedan";
        System.out.println(c2.company);
        System.out.println(c2.name);
        System.out.println(c2.seat);
        System.out.println(c2.type);

    }
}

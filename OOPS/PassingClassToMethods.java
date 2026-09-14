package OOPS;

public class PassingClassToMethods {
    public static class car{
        String company;
        String name;
        int length;
        String type;
        // method ko class k andr b bna skte h
        void print(){
            System.out.println(company+" "+name+" "+length+" "+type);
        }
    }
    public static void main(String[] args) {
        car c1=new car();
        c1.company="Toyota";
        c1.name="Fortuner";
        c1.length=4;
        c1.type="XUV";
        change(c1);
        System.out.println(c1.name);
        c1.print();
    }

    private static void change(car x) {
        x.name="Hyrider";
    }
}

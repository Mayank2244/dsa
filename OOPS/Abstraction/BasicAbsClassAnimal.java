package OOPS.Abstraction;
abstract class animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal is Eating");
    }
}



    class dog extends animal {

        @Override
        void sound() {
            System.out.println("DOG barks");
        }
    }

    class cat extends animal {
        @Override
        void sound() {
            System.out.println("CAT meowsss");
        }
    }
abstract class BasicAbsClassAnimal {

    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.sound();
        cat c=new cat();
        c.eat();
        c.sound();
    }
}


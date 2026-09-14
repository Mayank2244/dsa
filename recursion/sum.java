package recursion;

public class sum {
    static void main(String[] args) {
        System.out.println(sumall(5));

    }
    public static int sumall(int n){
        if(n==0){
            return 0;
        }
        return n+sumall(n-1);

    }
}

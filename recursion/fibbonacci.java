package recursion;

public class fibbonacci {
    static void main(String[] args) {
        System.out.println(fibb(20));
    }
    public static int fibb(int n) {
        if (n <= 1) {
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
}

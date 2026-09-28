package recursion;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         //without recursion


//        int sum=0;
//        while(n>0){
//            int digit=n%10; // last number nikal skte h to find or get last digit
//            sum+=digit;//digits add krdi sum m
//            n=n/10; //remove last digits
//        }
//        System.out.println(sum);
        System.out.println(find(n));
    }
    // with recursion
    public static int find(int n){
        if(n==0){
            return 0;
        }
        int digits=n%10;
        int sum=0;
        sum+=digits+find(n/10);

        return sum;

    }
}

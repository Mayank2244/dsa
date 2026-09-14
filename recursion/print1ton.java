package recursion;

import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(1,n);
        //nto1(5);

    }
    public static void print(int x,int n){
        if(x>n)return;
        System.out.println(x);
        print(x+1,n);

    }

//    public static void nto1(int m){
//        if(m==0)return;
//        System.out.println(m);
//        nto1(m-1);
//
//
//    }
}

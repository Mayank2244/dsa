package recursion;

import java.util.Scanner;

public class coinchange2 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("amount");
        int amount=sc.nextInt();
        System.out.println("lenght");
        int n=sc.nextInt();


        int[] arr=new int[n];
        System.out.print("enter array");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }
        System.out.println(" ");
        System.out.print(solve(arr,amount,0));
    }
    public static int solve(int[]arr,int amount,int idx){
        if(idx==arr.length){
            return 0;
        }
        if(amount<0){
            return 0;
        }
        if(amount==0){
            return 1;
        }
        //take
        int take=solve(arr,amount-arr[idx],idx);
        // not take
        int not=solve(arr,amount,idx+1);
        return take+not;
    }
}

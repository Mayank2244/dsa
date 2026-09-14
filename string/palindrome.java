package string;
import java.util.*;
public class palindrome {
    public static boolean palindrome(String str){
        int l=0;
        int n=str.length();
        int r=n-1;
        while(l<r){
            if(str.charAt(l)==str.charAt(r)){
                return true;
            }

            l++;
            r--;
        }
        return false;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        boolean result=palindrome(str);
        System.out.println(result);



    }
}

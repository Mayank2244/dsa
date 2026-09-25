// normal code



//package recursion;
//
//import java.util.Scanner;
//
//public class generateparenthesis {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//   generate(n,0,0," ");
//
//    }
//    public static void generate(int n,int l,int r,String s){
//        if(r==n&&l==n){
//            System.out.print(s+" ");
//            return;
//        }
//        if(l<n){
//            generate(n,l+1,r,s+"(");
//        }
//        if(r<l){
//            generate(n,l,r+1,s+")");
//        }
//
//
//    }
//}



//leetcode version
package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generateparenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();

        List<String>ans=new ArrayList<>();
        System.out.println(generateParenthesis(n));

    }
    public static List<String>generateParenthesis(int n){
        List<String>ans=new ArrayList<>();
        generate(n,0,0," ",ans);
        return ans;
    }

    public static void generate(int n,int l,int r,String s,List<String>ans){
        if(l==n&&r==n){
            ans.add(s);
            return;
        }
        if(l<n){
            generate(n,l+1,r,s+"(",ans);
        }
        if(r<l){
            generate(n,l,r+1,s+")",ans);
        }


    }
}


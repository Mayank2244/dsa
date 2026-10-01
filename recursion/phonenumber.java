package recursion;

import java.util.Scanner;

public class phonenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String digits=sc.next();
        String []map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits.length()==0){
            return;
        }
        backtracking(digits,"",0,map);
//        System.out.println(ans);


    }
    public static void backtracking(String digits,String curr,int idx,String[] map){
        //base case
        if(idx==digits.length()){
            System.out.print(curr+" ");
            return;

        }
        // get current digits to convert it into integer
        int digit=digits.charAt(idx)-'0'; // ye 0 valal idea ni h kse kam krta h butye convert kr deta h integer m
        String number=map[digit]; // ye bna ra h new value number m isko direct b kr skte the but we just have to
        // excat value for the digits like 23 so first make it 2 now map[2] fetch the detail from map also the size
        // is samke
        for(int i=0;i<number.length();i++){
            char ch=number.charAt(i);
            backtracking(digits,curr+ch,idx+1,map);
        }
    }
}

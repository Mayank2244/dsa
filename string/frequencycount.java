package string;

import java.util.Scanner;

public class frequencycount {
    // using without tochararray
//    public static void countfreq(String str){
//        int count=0;
//        int[] fre=new int[26];
//        int n=str.length();
//        for(int i=0;i<n;i++){
//            char ch=str.charAt(i);
//            int index=ch-'a';
//            fre[index]++;
//
//        }
//        for(int i=0;i<26;i++){
//            if(fre[i]>0){
//                char ch=(char)('a'+i);
//                System.out.println(ch+"--> "+ fre[i]);
//            }
//        }
//    }
    public static void countfreq(String str){
        int[] fre=new int[26];
        char[]arr=str.toCharArray();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=arr[i];
            int idx=ch-'a';
            fre[idx]++;

        }
        for(int i=0;i<26;i++){
            if(fre[i]>0){
                char ch=(char)('a'+i);
                System.out.println(ch+"-->"+fre[i]);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        countfreq(str);


        sc.close();

    }
}

package Arrays;
import java.util.*;

public class besttimetobyandsale {
    public static int bands(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=Math.min(min,arr[i]);
            }
            max=Math.max(max,arr[i]-min);

        }
        return max;


    }
  public   static void main(String[] args) {
//without scanner we can make it
//      int[] arr=new int[]{7,1,5,3,6,4};
//      int n=6;
//      // this is the method to make it with object
//      //besttimetobyandsale obj=new besttimetobyandsale();
//      //int b=obj.bands(arr);
//      int b=bands(arr);
//      System.out.println(b);

      Scanner sc=new Scanner(System.in);
      System.out.println("enfther nebr");
      int n=sc.nextInt();
      int[] arr= new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int res=bands(arr);
      System.out.println(res);
  sc.close();
   }

}

package Arrays;
import java.util.*;

public class secondlargest {
    private int seclarge(int[] nums){
        int max=nums[0];
        int smax=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
           if( nums[i]>max){
               max=nums[i];
           }
        if(nums[i]>max&&nums[i]!=max){
            smax=nums[i];
        }

    }
        return smax;
}

   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        secondlargest sec=new secondlargest();
       System.out.println(sec.seclarge(nums));
//        for(int i=0;i<n;i++){
//            System.out.println(secmax[i]);
//        }
        sc.close();
   }

    }


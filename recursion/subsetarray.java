package recursion;

import java.util.List;

public class subsetarray {
    static void main(String[] args) {
        int []arr={1,2,3};
        subset(arr,0,"");
    }
    public static void subset(int[]arr, int idx, String ans){
        if(idx==arr.length){
            System.out.print(ans+" ");
            return;
        }
        subset(arr,idx+1,ans+arr[idx]);
        //dont take
        subset(arr,idx+1,ans);

    }
}

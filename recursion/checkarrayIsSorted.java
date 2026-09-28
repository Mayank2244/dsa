package recursion;

public class checkarrayIsSorted {
    public static void main(String[] args) {
        int []arr={10,20,30,40};
        System.out.println(sort(arr,0));
    }
    public static boolean sort(int[]arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return sort(arr,idx+1);
    }
}

package recursion;

public class recursionArrays {
    public static void main(String[] args) {
        int[] arr={12,10,2,3,34};
        traverse(arr,0);
    }
    public static void traverse(int[]arr,int idx){
        if(idx==arr.length)return;
        System.out.print(arr[idx]+" ");
        traverse(arr,idx+1);
    }
}


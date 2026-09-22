package recursion;
// time complexity log n also the sapce complexity logn

public class binarysearch {
    public static void main(String[] args) {
        int []arr={1,23,34,46,647,576,1222};
//        int target=46;
        System.out.println(search(arr,46,0,arr.length));

    }
    public static int search(int []arr,int target,int low,int high){
        int mid=(low+high)/2;
        if(low>high)return -1;
        if(arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]>target){
            return search(arr,target,mid+1,high);

        }
        else {
            return search(arr,target,low,mid-1);
        }
    }
}

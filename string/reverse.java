package string;

public class reverse {
    static void main(String[] args) {
        String str="My Name is Mayank";
        int n=str.length();
        char[] arr=str.toCharArray();
        int l=0;
        int r=n-1;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(new String(arr));
    }
}

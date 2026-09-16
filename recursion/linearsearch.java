package recursion;

public class linearsearch {
    public static void main(String[] args) {
        int []arr={1,234,346,6,4,24};
        int ele=6;
        System.out.println(find(arr,6,0));
    }
    public static boolean find(int[]arr,int ele,int idx){
        if(idx== arr.length){
            return false;
        }
        if(arr[idx]==ele){
            return true;
        }
        return find(arr,ele,idx+1);
    }
}

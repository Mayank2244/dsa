package recursion;

public class subset {
    public static void main(String[] args) {
        String s="abc";
        sebsetcall(" ",s,0);
    }
    public static void sebsetcall(String ans,String s,int idx){
        if(idx==s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(idx);
        //pick
        sebsetcall(ans+ch,s,idx+1);
        //skip
        sebsetcall(ans,s,idx+1);

    }
}

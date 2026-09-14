package string;

public class vowels {
    public static void main(String[] args) {
        String str="hello";
        int countc=0;
        int countv=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                countv++;

            }
            else{
                countc++;

            }
        }
        System.out.println("vowels"+"="+countv);
        System.out.println("Consontent  ->"+"  "+countc);
    }
}

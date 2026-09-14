package BinaryTree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class binarytreeBasic {
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(1);
        Node e=new Node(5);
        Node f=new Node(0);
        Node g=new Node(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        d.left=g;
//        display(a);
//        System.out.println(size(a));
//        System.out.println(sum(a));
//        System.out.println(product(a));
//        System.out.println(zeroproduct(a));

        System.out.println(maxnumber(a));
        System.out.println(levels(a));
    }
    // ye recursion method h ki phle to jo element h main usko dal do end after that
    //continue left and right
    private static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }
    // total size find krne kliye
    // agr binary tree achhe s krna h to recursion ana chahiye
   private static int size(Node root){
        if(root==null)return 0;
       int left=size(root.left);
        int right=size(root.right);
        return 1+left+right;
        //return root==null ? 0:1 +size(root.left)+size(root.right);


    }
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    // wehn element non zero
    private static int product(Node root){
        if(root==null) return 1;
        int mul=product(root.left);
        int rmul=product(root.right);
       int  total =root.val*mul*rmul;
        return total;
    }
    private static int zeroproduct(Node root){
        if(root==null) return 1;
        int mul=zeroproduct(root.left);
        int rmul=zeroproduct(root.right);
        int  total = 0;
        if(root.val==0) {
            return mul*rmul;
        }
        total = root.val * mul * rmul;
            return total;

    }
    private static int maxnumber(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxnumber(root.left),maxnumber(root.right)));
    }
    private static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
}

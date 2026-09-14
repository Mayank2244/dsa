package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void breadthfirst(Node root){
        if(root==null)return;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current=q.poll();
            System.out.print(current.val+" ");
            if(current.left!=null){
                q.add(current.left);
            }
            if(current.right!=null){
                q.add(current.right);
            }

        }

    }
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
        breadthfirst(a);

    }
}

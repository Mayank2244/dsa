package Queue;

class circularArray{
    private int []arr;// ya to isme hi fix length de skteh array ki other wise we also make constructor example new int[100]
   private int front;
   private int rear;
    private int size;
    // all integer has fix dafault vlaue 0;
    circularArray(int capacity){
        arr=new int[capacity];

    }
    void add(int val){
        if(size==arr.length){
            System.out.println("queue is full");
            return;
        }
        arr[rear++]=val;
        if(arr.length==0) rear=0;

        size++;


    }
    int remove(){
        if(size==0){
            System.out.println("empty");
            return -1;
        }
        int frontval=arr[front];
        front++;
        if(arr[front]==0)front=0;
        size--;
        return frontval;
    }
    int peek(){
        if (size==0){
            System.out.println("Queue is EMPTY!");
            return -1;
        }
        return arr[front];
    }
    void display(){
        if(size==0) return;
        if(front>=rear){
            for(int i=front;i<arr.length;i++){
                System.out.print(arr[i]+" ");

            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");

            }
        }
        else{
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+" ");

            }
        }
        System.out.println(" ");
    }
}
public class queueusingCircularArray {
    public static void main(String[] args) {
    circularArray q=new circularArray(5);
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
   // q.add(50);
    q.display();
    System.out.println(q.remove());
    q.display();
    q.add(60);
    q.display();
        System.out.println(q.peek());

    }
}

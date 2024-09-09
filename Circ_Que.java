public class Circ_Que{

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        Queue(int size){
            arr = new int[size];
            this.size=size;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        //enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return; 
            }
            if(front == -1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //dequeue - 0(1)
        public static int delete(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            //single element
            if(rear == front){
                rear = front = -1;
            }
            else{
                front=(front+1)%size;
            }

            return result;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(7);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.delete());
        q.add(6);
        q.add(7);
        System.out.println(q.delete());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.delete();
        }
    
    }
}
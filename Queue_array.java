public class Queue_array{

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;

        Queue(int size){
            arr = new int[size];
            this.size=size;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //enqueue
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full, overflow.");
                return ;
            }
            rear+=1;
            arr[rear]=data;
        }

        //dequeue - 0(n)
        public static int delete(){
            if(rear == -1){
                System.out.println("Queue is empty, underflow.");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.delete();
        }
    
    }
}
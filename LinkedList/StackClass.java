public class StackClass{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Stack{
        public static Node top;

        public static boolean isEmpty(){
            return top==null;
        }
        
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                top=newNode;
                return;
            }
            newNode.next=top;
            top=newNode;
        }

        public static void pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return ;
            }
            Node temp=top;
            top=top.next;
            temp.next=null;
            System.out.println("Popped item is "+temp.data);
        }

        public static void peek(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return ;
            }
            System.out.println("Top item is "+top.data);
        }

    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            s.peek();
            s.pop();
        }
    }
}
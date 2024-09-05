public class LL{
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;        
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node p =head;
        while (p.next!=null) {
            p=p.next;
        }
        p.next=newNode;
    }
    
    public void printList(){
        if(head == null){
            System.out.print("List is empty");
            return ;
        }
        Node p =head;
        while (p!= null) {
            System.out.print(p.data+"->");
            p=p.next;
        }
        System.out.print("NULL");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty as Fuck");
            return;
        }
        size--;
        head=head.next;
    }

    public void deleteLast(){
        //empty list edge case
        if(head == null){
            System.out.println("List is empty as Fuck");
            return;
        }
        size--;
        //single node edge case
        if(head.next == null){
            head = null;
            return;
        } 

        Node sl=head;
        Node l=head.next;
        while(l.next !=null){
            l=l.next;
            sl=sl.next;
        }
        sl.next=null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        System.out.println();
        list.addLast("list");
        list.printList();
        System.out.println();
        list.addFirst("this");
        list.printList();
        System.out.println();
        list.deleteFirst();
        list.printList();
        System.out.println();
        list.deleteLast();
        list.printList();
        System.out.println();

        System.out.println(list.getSize());
    }
}
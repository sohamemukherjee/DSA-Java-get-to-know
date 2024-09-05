public class rev_it_list{
    Node head;
    private int size;
    rev_it_list(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;        
    }

    public void addLast(int data){
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
        System.out.println("NULL");
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

    public void reverseIterate(){
        if (head == null || head.next == null) {
            System.out.println("Empty");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null) {
            Node nextNode = currNode.next;         
            currNode.next=prevNode;

            //update
            prevNode= currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args){
        rev_it_list list = new rev_it_list();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        // list.addLast(5);
        // list.addLast(6);
        list.printList();
        list.reverseIterate();
        list.printList();
    }
}
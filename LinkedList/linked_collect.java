import java.util.*;

class linked_collect{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);
        list.add("list");//.addLast(String) works the same
        System.out.println(list);
        System.out.println(list.size());
        for (String string : list) {//list.size() works here too
            System.out.print(string+" -> "); //list.get()
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        //removes at index position
        // list.remove(3);
    }
} 
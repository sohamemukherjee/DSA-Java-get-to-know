import java.util.*;

public class Que_collec {
    public static void main(String[] args) {
        // CustomQueue q = new CustomQueue();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();            
        }
    }
    
}

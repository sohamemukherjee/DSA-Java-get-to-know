import java.util.*;

public class age18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        if(a>=18)
            System.out.println("Eligible Voter");
        else
            System.out.println("Not Eligible");
        sc.close();
    }
}

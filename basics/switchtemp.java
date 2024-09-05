import java.util.*;

public class switchtemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int ch;
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Bonjour");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}

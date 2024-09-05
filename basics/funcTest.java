import java.util.*;
public class funcTest {
    // public static void printName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int add(int a, int b){
    //     return (a+b);
    // }

    public static void factorial(int a){
        if(a<0)
            System.out.println("Cannot be computed");
        if (a==0)
            System.out.println("Factorial : 1");
        else{
            int factorial=1;
            for(int i=1;i<=a;i++)
                factorial=factorial*i;
            System.out.println("Factorial Computed : "+factorial);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a name : ");
        // String name=sc.nextLine();
        // printName(name);
        // System.out.print("Enter two numbers : ");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int res=add(a,b);
        // System.out.println("Result : "+res);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        factorial(n);
        sc.close();
    }
    
}

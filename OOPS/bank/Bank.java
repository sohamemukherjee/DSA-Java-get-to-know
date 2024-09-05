package bank;

class Acc{
    public String name;
}


public class Bank{
    public static void main(String args[])
    {
        Acc a = new Acc();
        a.name = "Neal";
        System.out.println(a.name);
    }
}
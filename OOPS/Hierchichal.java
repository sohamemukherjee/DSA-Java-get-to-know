// Explains the single level iunheritance1
// import bank.*;


class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(.5*l*h);

    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class Hierchichal {
    public static void main(String args[]){
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.area(10);        
        Circle c1 = new Circle();
        c1.area(10);
        //  account1 = new Acc();
        // account1.name = "customer";
        // System.out.println(account1.name);
    }
}

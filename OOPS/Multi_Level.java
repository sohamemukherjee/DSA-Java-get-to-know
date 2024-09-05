// Explains the single level iunheritance1
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

class EquilateralTriangle extends Triangle{
    public void area(int s){
        System.out.println(1.732*s*s*.25);
    }
}

public class Multi_Level {
    public static void main(String args[]){
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.area(10);        
    }
}

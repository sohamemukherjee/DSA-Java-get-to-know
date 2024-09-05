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

public class Single_Level {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.area(9,10);        
    }
}

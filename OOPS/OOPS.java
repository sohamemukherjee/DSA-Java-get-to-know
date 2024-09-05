interface Animal{
    public void walk();

}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walks on 4 Legs");
    }
}

public class OOPS {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
    
}

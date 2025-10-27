abstract class animal{
    abstract void walk();
}

class Horse extends animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class abstraction {

    public static void main(String[] args) {
        
        Horse horse = new Horse();
        horse.walk();
    }
}

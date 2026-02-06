package learning;

abstract class Animal{
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse() {
        System.err.println("Created Horse");
    }
    public void walk(){
        System.out.println("Horse have 4 legs");
    }
}

public class abstracting {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.walk();

        Animal a = new Horse();
        a.walk();
    }
}

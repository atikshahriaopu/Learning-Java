package learning;

interface Animal{
    void walk(); //public abstract by default (public, static, final) 
}
interface Sound{

}
class Chiken implements Animal, Sound{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Chiken c = new Chiken();
        c.walk();
    }
}

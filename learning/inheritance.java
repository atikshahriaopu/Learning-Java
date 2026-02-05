package learning;
class Shape{
    String color;
}

class Triangle extends Shape{
    public void printColor(String color) {
        System.out.println(color);
    }
    public void area(int l, int h) {
        System.out.println("Triangle Area = " + 0.5 * l * h);
    }

}
class EquilateralTriangle extends Triangle{
     public void printColor(String color) {
        super.printColor(color);
    }
    public void area(int l, int h) {
        super.area(l, h);
    }
}
class Circle extends Shape{
    public void printColor(String color) {
        System.out.println(color);
    }
    public void area(int r) {
        System.out.println("Circle Area = " + (3.14) * r * r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.printColor(t1.color);
        t1.area(4, 5);

        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.color = "Green";
        e1.printColor(e1.color);
        e1.area(2, 3);

        Circle c1 = new Circle();
        c1.color = "Yellow";
        c1.printColor(c1.color);
        c1.area(1);
    }
}

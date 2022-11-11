package ss6_Inheritance_Polymorphism.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle("red",5);
        System.out.println(circle.getAreaCircle());
        System.out.println(circle1);
        System.out.println("Area Circle is: "+circle1.getAreaCircle());
    }
}

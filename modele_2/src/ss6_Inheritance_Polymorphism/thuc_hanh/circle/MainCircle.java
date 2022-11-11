package ss6_Inheritance_Polymorphism.thuc_hanh.circle;

import ss6_Inheritance_Polymorphism.thuc_hanh.circle.Circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle("red", true, 5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimetter());
        System.out.println(circle);

    }
}

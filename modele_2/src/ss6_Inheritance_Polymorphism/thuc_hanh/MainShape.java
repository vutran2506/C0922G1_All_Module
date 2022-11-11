package ss6_Inheritance_Polymorphism.thuc_hanh;

import ss6_Inheritance_Polymorphism.thuc_hanh.Shape;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("blue",false);
        System.out.println(shape1);
    }
}

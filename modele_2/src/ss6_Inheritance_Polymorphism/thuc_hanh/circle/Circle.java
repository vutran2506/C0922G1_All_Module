package ss6_Inheritance_Polymorphism.thuc_hanh.circle;

import ss6_Inheritance_Polymorphism.thuc_hanh.Shape;

public class Circle extends Shape {
    private double radius = 1;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimetter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " A Circle with radius" + radius +
                ".Which is a subclaas of  " + super.toString()+"}";
    }
}

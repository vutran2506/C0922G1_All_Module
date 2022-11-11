package ss6_Inheritance_Polymorphism.bai_tap.Circle;

public class Circle {
    private String color;
    private double radius;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Circle() {

    }

    public double getAreaCircle() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return
                "Circle have color is '" + color + '\'' +
                ",and radius is " + radius +
                '}';
    }
}

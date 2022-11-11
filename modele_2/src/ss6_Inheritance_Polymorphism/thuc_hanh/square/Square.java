package ss6_Inheritance_Polymorphism.thuc_hanh.square;

import ss6_Inheritance_Polymorphism.thuc_hanh.Rectangle.Rectangle;

public class Square extends Rectangle {
    private double side = 1;

    public Square(double side) {
        this.side = side;
    }
    public Square(){

    }

    public Square(double width, double height, double side) {
        super(width, height);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "A Square with side" + side +
                " which is subclass of Rectangle }";
    }
}


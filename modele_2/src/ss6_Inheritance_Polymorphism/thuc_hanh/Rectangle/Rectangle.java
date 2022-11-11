package ss6_Inheritance_Polymorphism.thuc_hanh.Rectangle;

import ss6_Inheritance_Polymorphism.thuc_hanh.Shape;

public class Rectangle extends Shape {
private double width = 5;
private  double height = 3;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public  Rectangle(){

    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAreaRectangle(){
        return width*height;
    }
    public double getPerimeterRectangle(){
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A Rectangle width size width=" + width +
                ", height=" + height +
                " which is a subclass  "+super.toString()+"}";
    }
}


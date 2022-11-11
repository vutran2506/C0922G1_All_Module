package ss6_Inheritance_Polymorphism.bai_tap.Circle;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(){

    }
    public double getVolumeCylinder(){
        return getAreaCircle()*height;
    }

    @Override
    public String toString() {
        return
                " Cylinder have height is " + height +
                " which is a subclass "+"And "+super.toString();
    }
}

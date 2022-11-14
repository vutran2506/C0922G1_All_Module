package ss7_abctractClass_Interface.bai_tap.Resizeable.Shape;

public class Circle extends  Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){

    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Circle " +
                " have  radius = " + radius +" is :"
                ;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()+ getRadius()*(percent/100));
    }
}

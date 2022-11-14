package ss7_abctractClass_Interface.bai_tap.Resizeable.Shape;

public class Rectangle extends  Shape{
    private double width = 2;
    private  double height=1;

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

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public  Rectangle (){

    }
    public double getArea(){
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return "Rectangle" +
                " have width=" + width +
                ", height=" + height +
                " is : ";
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight()+getHeight()*(percent/100));
        setWidth(getWidth()+getWidth()*(percent/100));
    }
}

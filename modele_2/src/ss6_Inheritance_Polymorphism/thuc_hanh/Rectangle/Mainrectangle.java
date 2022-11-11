package ss6_Inheritance_Polymorphism.thuc_hanh.Rectangle;

public class Mainrectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("red",true,10,5);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getAreaRectangle());
        System.out.println(rectangle1.getPerimeterRectangle());

    }
}

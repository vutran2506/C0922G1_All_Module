package ss7_abctractClass_Interface.bai_tap.Resizeable;

import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Circle;
import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Rectangle;
import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Shape;
import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Square;

public class TestResizeeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 3);
        shapes[2] = new Square(3);
        System.out.println("Pre changed");

        for (Shape shape: shapes){
            System.out.println(shape +" "+shape.getArea());
        }
        shapes[0].resize(10);
        shapes[1].resize(60);
        shapes[2].resize(100);
        System.out.println("After changed");

        for (Shape shape:shapes){
            System.out.println(shape+" "+shape.getArea());
        }
    }
}

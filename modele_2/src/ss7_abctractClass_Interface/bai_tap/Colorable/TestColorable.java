package ss7_abctractClass_Interface.bai_tap.Colorable;

import ss7_abctractClass_Interface.bai_tap.Colorable.Square.Square;

import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Circle;
import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Rectangle;
import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Shape;

public class TestColorable {
    public static void main(String[] args) {
        Shape [] shapes = new  Shape[4];
        shapes[0]=new Circle(3);
        shapes [1] = new Rectangle(4,3);
        shapes[2] = new Square(4);
        shapes[3] = new Square(5);
        for (Shape shape:shapes){
            System.out.println( "Area "+shape+" "+shape.getArea());
        }
        for (Shape shape: shapes){
            if (shape instanceof Square){
                Colorable colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }

        }
    }

}

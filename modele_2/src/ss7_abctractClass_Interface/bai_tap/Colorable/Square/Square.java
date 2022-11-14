package ss7_abctractClass_Interface.bai_tap.Colorable.Square;

import ss7_abctractClass_Interface.bai_tap.Colorable.Colorable;
import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Rectangle;

public class Square extends Rectangle implements Colorable {
    private double edge ;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        super.setHeight(edge);
        super.setWidth(edge);
    }

    public Square(double edge) {
        super(edge,edge);
    }

    @Override
    public String toString() {
        return "Square"
                ;
    }

    @Override
    public String howToColor() {
        return "Color all four edge";
    }
}


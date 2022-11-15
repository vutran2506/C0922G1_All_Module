package ss7_abctractClass_Interface.bai_tap.Colorable.Square;

import ss7_abctractClass_Interface.bai_tap.Colorable.Colorable;
import ss7_abctractClass_Interface.bai_tap.Resizeable.Shape.Rectangle;

public class Square extends Rectangle implements Colorable {
    private  double edge ;

    public  double getEdge() {
            return this.edge = super.getHeight();
    }

    public Square(double edge) {
        super(edge, edge);
    }

    public Square() {

    }

    public void setEdge(double edge) {
        super.setHeight(edge);
        super.setWidth(edge);
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + getEdge() +
                '}';
    }

    @Override
    public String howToColor() {
        return "Color all four edge";
    }
}


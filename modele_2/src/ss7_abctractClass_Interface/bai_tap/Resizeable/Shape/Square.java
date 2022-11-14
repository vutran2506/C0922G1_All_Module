package ss7_abctractClass_Interface.bai_tap.Resizeable.Shape;

public class Square extends Shape{
    private double edge ;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Square(double edge) {
        this.edge = edge;
    }
    public  Square(){

    }
    public double getArea(){
        return this.edge*this.edge;
    }

    @Override
    public String toString() {
        return "Square" +
                " have edge=" + edge +
                " is: ";
    }

    @Override
    public void resize(double percent) {
        setEdge(getEdge()+getEdge()*(percent/100));
    }
}

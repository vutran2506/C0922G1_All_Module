package ss6_Inheritance_Polymorphism.bai_tap.Point2D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){

    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float arr[]={x,y} ;
        return arr;
    }

    @Override
    public String toString() {
        return ",Có toạ độ x là :" + x +
                ", có toạ độ y là" + y
                ;
    }
}

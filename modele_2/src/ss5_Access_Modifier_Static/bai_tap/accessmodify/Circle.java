package ss5_Access_Modifier_Static.bai_tap.accessmodify;

public class Circle {
    private double radius = 1;
    private String color = "red";

    Circle() {
    }
        private Circle(double radius){
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}


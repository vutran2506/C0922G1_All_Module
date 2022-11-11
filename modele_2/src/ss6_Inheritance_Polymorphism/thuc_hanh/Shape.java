package ss6_Inheritance_Polymorphism.thuc_hanh;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }

   public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled) {
            return "Shape{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        } else {
            return "Shape{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }
    }
}

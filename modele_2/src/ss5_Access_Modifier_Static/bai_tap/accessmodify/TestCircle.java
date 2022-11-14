package ss5_Access_Modifier_Static.bai_tap.accessmodify;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(20);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}

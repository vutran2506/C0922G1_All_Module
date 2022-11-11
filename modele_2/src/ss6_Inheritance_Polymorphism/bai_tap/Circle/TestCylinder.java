package ss6_Inheritance_Polymorphism.bai_tap.Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("blue",5,10);
        System.out.println(cylinder);
        System.out.println("Volume Cylinder is "+cylinder.getVolumeCylinder());
    }
}

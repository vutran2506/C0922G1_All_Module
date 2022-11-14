package ss7_abctractClass_Interface.thuc_hanh.Main;

import ss6_Inheritance_Polymorphism.thuc_hanh.circle.Circle;
import ss7_abctractClass_Interface.thuc_hanh.CircleComparator.CircleComparator;
import ss7_abctractClass_Interface.thuc_hanh.ComparableCircle.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;


public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("Black", true, 3.5);
        System.out.println("Pre sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);
        System.out.println("After sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }


    }
}

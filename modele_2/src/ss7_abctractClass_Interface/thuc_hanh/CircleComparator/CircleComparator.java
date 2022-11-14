package ss7_abctractClass_Interface.thuc_hanh.CircleComparator;

import ss6_Inheritance_Polymorphism.thuc_hanh.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle circle1, Circle circle2) {
        if (circle1.getRadius()> circle2.getRadius())
            return 1;
        else if(circle1.getRadius()< circle2.getRadius())
            return -1;
        else
            return 0 ;
    }
}

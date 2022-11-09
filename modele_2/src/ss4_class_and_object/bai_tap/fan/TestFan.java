package ss4_class_and_object.bai_tap.fan;

import ss4_class_and_object.bai_tap.fan.Fan;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan();
        System.out.println(fan1);
        System.out.println(fan2);
    }
}

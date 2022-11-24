package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {


    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        double edge1;
        double edge2;
        double edge3;
do {
    try {
        System.out.println("Nhập cạnh thứ nhất");
        edge1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh thứ hai");
        edge2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh thứ ba");
        edge3 = Double.parseDouble(scanner.nextLine());
        checkTriangle(edge1,edge2,edge3);
        break;
    } catch (IllegalTriangleException | NumberFormatException e){
        System.err.println(e.getMessage());
    }
} while (true);
}
    public static void checkTriangle(double edge1, double edge2, double edge3) throws IllegalTriangleException {
        if (edge1 < 0 || edge2 < 0 || edge3 < 0 || (edge1 + edge2) <= edge3 || (edge2 + edge3) <= edge1
                || (edge3 + edge1) <= edge2) {
            throw new IllegalTriangleException();
        }
    }

}
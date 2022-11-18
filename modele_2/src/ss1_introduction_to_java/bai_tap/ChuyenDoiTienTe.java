package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency dola");
        double dola = scanner.nextDouble();
        double vnd = dola*rate;
        System.out.println("Convert to VND: "+ vnd+" VND");

    }
}

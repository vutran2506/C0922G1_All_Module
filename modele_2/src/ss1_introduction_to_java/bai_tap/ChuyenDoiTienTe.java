package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency dola");
        int dola = scanner.nextInt();
        int vnd = dola*rate;
        System.out.println("Convert to VND: "+ vnd+" VND");

    }
}

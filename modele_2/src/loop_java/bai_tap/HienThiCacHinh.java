package loop_java.bai_tap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        int width = scanner.nextInt();
        System.out.println("Nhập chiều cao");
        int heigth = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            System.out.println(" ");
            for (int j = 0; j < heigth; j++) {
                System.out.print("*");
            }
        }



        for (int i = 0; i <= heigth; i++) {
            System.out.println(" ");
            for (int j = 0 ;j<=i; j++) {
                System.out.print("*");
            }
        }


        for (int i = heigth;i>=0; i--) {
            System.out.println(" ");
            for (int j = 0 ;j<=i; j++) {
                System.out.print("*");
            }
        }
    }
}

package loop_java.bai_tap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        int width = scanner.nextInt();
        System.out.println("Nhập chiều cao");
        int heigth = scanner.nextInt();
        System.out.println("Lựa chọn hình hiển thị bằng cách nhập số tương ứng");
        System.out.println("1: Tạo hình chữ nhật");
        System.out.println("2: tạo tam giác vuông hướng lên trên");
        System.out.println("3: Tạo tam giác hướng xuống dưới");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                for (int i = 0; i < width; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < heigth; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                for (int i = 0; i <= heigth; i++) {
                    System.out.println(" ");
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                for (int i = heigth; i >= 0; i--) {
                    System.out.println(" ");
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
        }
    }
}

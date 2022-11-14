package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp số thứ nhất");
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập số thứ 2");
        int num1 = Math.abs(Integer.parseInt(scanner.nextLine()));
        if (num == 0 || num1 == 0) {
            System.out.println("Không có ước chung");
        }
        while (num != num1) {
            if (num > num1) {
                num = num - num1;
            } else {
                num1 = num1 - num;
            }
        }
        System.out.println("UCLN là: " + num);
    }
}

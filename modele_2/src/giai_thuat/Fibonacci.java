package giai_thuat;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đây");
        int num = Integer.parseInt(scanner.nextLine());
        while (num > 20 || num < 0) {
            System.out.println("Mời nhập lại số nhỏ hơn 20");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(fibonacci(num));

    }

    public static int fibonacci(int number) {
        int a = 1;
        int b = 1;
        int c = 0;
        if (number <2) {
            return 1;
        } else {
            for (int i = 2; i <= number; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

}

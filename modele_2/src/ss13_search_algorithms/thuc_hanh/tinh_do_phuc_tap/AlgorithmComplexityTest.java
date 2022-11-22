package ss13_search_algorithms.thuc_hanh.tinh_do_phuc_tap;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đây");
        String string = scanner.nextLine();
        int[] arrChar = new int[255];
        int size = string.length();
        for (int i = 0; i < size; i++) {
            int ascii = string.charAt(i);
            arrChar[ascii] += 1;
        }

        char character = 255;
        int max = 0;
        for (int i = 0; i < 255; i++) {
            if (arrChar[i] > max) {
                max = arrChar[i];
                character = (char) i;
            }
        }
        System.out.println("Ký tự xuất hiện nhiều lần nhất là " + character + " nó xuất hiện  " + max + " lần");
    }
}

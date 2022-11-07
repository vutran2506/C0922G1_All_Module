package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần chèn");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí cần chèn");
        int index = Integer.parseInt(scanner.nextLine());
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrLength = arr.length;
        if (index <= -1 || index >= arrLength - 1) {
            System.out.println("Không thể chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < arrLength; i++) {
                if (index == i) {
                    for (int j = arrLength - 1; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[i] = num;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

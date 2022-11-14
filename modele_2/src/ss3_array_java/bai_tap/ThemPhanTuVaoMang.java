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
        int [] arr1 = new int[11];

        int arr1Length = arr1.length;
        if (index <= -1 || index >= arr1Length - 1) {
            System.out.println("Không thể chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < arr1Length; i++) {
                if (index == i) {
                    for (int j = arr1Length - 1; j > i; j--) {
                        arr1[j] = arr[j - 1];
                    }
                    arr1[i] = num;
                    break;
                }
                arr1[i]= arr[i];
            }
            System.out.println(Arrays.toString(arr1));
        }
    }
}

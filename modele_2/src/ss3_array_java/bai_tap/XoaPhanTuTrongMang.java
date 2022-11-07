package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xoá");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; ) {
            if (num == arr[i]) {
                for (int j = i; j < arrLength - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arrLength - 1] = 0;
                continue;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

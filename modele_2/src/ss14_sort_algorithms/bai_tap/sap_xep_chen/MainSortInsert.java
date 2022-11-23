package ss14_sort_algorithms.bai_tap.sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class MainSortInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng ban đầu " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int pos = i;
            while (pos > 0 && temp < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = temp;
        }
        System.out.println("Mảng sau khi sắp xếp" + Arrays.toString(arr));
    }

}



package ss14_sort_algorithms.bai_tap.sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class SortInsert {
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
            System.out.println("Mảng trước khi chạy lần "+i);
            System.out.println(Arrays.toString(arr));
            int temp = arr[i];
            int pos = i;
            while (pos > 0 && temp < arr[pos - 1]) {
                System.out.println(" Giá trị tại vị trí "+i + " nhỏ hơn "+ " giá trị tại vị trí "+(pos-1));
                arr[pos] = arr[pos-1];
                System.out.println("Gán giá trị tại vị trí "+(pos-1)+" vào vị trí "+(pos ));
                pos--;
                System.out.println(Arrays.toString(arr));
            }
            arr[pos] = temp;
            System.out.println("Gán vào vị trí "+pos+"  ,giá trị tại vị  trí "+i+" của mảng ban đầu");
            System.out.println(" Sau khi chạy lần "+i+ "  "+ Arrays.toString(arr));
            System.out.println("---------------------------------------------");
        }
        System.out.println("Mảng sau khi sắp xếp"+Arrays.toString(arr));
    }

}


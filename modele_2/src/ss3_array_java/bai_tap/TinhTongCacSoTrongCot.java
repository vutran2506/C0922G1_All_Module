package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoTrongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cột");
        int col = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều dài hàng");
        int row = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử [" + i + "]" + "[" + j + "]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Nhập vị trí cột cần tinh");
        int index = Integer.parseInt(scanner.nextLine());
        while (index < 0 || index > row - 1) {
            System.out.println("Cột cần tính không có.Mời bạn nhập lại");
            index = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (index == i) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng độ dài cột " + index + " là:" + sum);
    }
}

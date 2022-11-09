package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cột và hàng");
        int rowAndCol =Integer.parseInt(scanner.nextLine());
        int sum =0;
        int [][] arr = new int[rowAndCol][rowAndCol];
        for (int i = 0; i < rowAndCol; i++) {
            for (int j = 0; j < rowAndCol; j++) {
                System.out.println("Nhập phần tử thứ ["+i+"]"+"["+j+"]");
                arr[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < rowAndCol; i++) {
            for (int j = 0; j < rowAndCol; j++) {
                if(i==j){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số nằm ở đường chéo  ma trận là: "+sum);
    }
}

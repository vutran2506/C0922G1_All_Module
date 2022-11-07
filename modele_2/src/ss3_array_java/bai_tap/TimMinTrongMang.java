package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cột");
        int col = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhâp chiều dài hàng");
        int row =Integer.parseInt(scanner.nextLine());
        int [][] arr = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("Nhập phần tử mảng vị trí ["+i+"]"+"["+j+"]" );
                arr [i][j] =Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int min = arr[0][0];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: "+min);
    }
}

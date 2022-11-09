package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của mảng");
        int arrLength = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Nhập phần tử mảng vị trí ["+i+"]" );
            arr [i] =Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arrLength; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: "+min);
    }
}

package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        System.out.println("Bài toán kiểm tra năm nhuận");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        int year = scanner.nextInt();
        if(year %4 ==0){
            if(year %100 ==0){
                if(year%400 ==0){
                    System.out.println("Đây là năm nhuận");
                }else {
                    System.out.println("Đây không phải là năm nhuận");
                }
            } else {
                System.out.println("Đây là năm nhuận");
            }
        }else {
            System.out.println("Đây không phải là năm nhuận");
        }
    }
}

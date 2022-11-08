package ss3_array_java.bai_tap;


import java.util.Scanner;

public class TimSoLanKyTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi vào đây");
        String chuoi = scanner.nextLine();
        System.out.println("Nhập ký tự cần kiểm tra");
        String kyTu = scanner.nextLine();
        int count =0;
        for (int i = 0; i < chuoi.length(); i++) {
            if(kyTu.charAt(0) == chuoi.charAt(i)){
                count+=1;
            }
        }
        System.out.println("Số lần ký tự xuất hiện trong chuỗi"+count);
    }
}

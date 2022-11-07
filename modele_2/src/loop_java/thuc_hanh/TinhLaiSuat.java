package loop_java.thuc_hanh;

import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 0.1;
        System.out.println("Nhập số tháng gửi");
        int soThangGui = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tiền gửi");
        double soTien =Integer.parseInt(scanner.nextLine());
        double laiSuat = (soTien*(rate/12)*soThangGui);
        System.out.println(" Số lãi bạn nhận được là: "+laiSuat);
    }
}

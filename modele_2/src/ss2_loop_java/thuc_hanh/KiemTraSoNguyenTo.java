package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = sc.nextInt();
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không phải là số nguyên tố ");
        }
    }
}

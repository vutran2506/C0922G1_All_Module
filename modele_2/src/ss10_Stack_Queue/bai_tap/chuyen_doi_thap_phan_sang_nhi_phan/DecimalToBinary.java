package ss10_Stack_Queue.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> nhiPhan = new Stack<>();
        System.out.println("Nhập số vào đây");
        num = Integer.parseInt(scanner.nextLine());
        while (num < 0) {
            System.out.println("Nhập lại số nguyên lớn hơn 0");
            num = Integer.parseInt(scanner.nextLine());
        }
        while (num > 0) {
            nhiPhan.push(num % 2);
            num = num / 2;
        }
        int size = nhiPhan.size();
        for (int i = 0; i < size; i++) {
            System.out.print(nhiPhan.pop());
        }

    }
}

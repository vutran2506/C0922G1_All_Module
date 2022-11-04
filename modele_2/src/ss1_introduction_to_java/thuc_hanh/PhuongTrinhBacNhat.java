package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất ");
        System.out.println("Phương trình bậc nhất có dạng: a*x +b =c");
        System.out.println("Nhập số a");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b");
        double b = scanner.nextDouble();
        System.out.println("Nhập c");
        double c = scanner.nextDouble();
        if(a!= 0){
            double answer =(c-b)/a;
            System.out.println("Phương trình có nghiệm là: "+answer);
        }else {
            if (b == c){
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiẹm");
            }
        }
    }
}

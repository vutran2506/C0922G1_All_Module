package loop_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num = 2;
        boolean check = true;
        while (num<100) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                check = true;
                if (num%i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println("Số nguyên tố nhỏ hơn 100 là: " +num);
            }
            num++;
        }
    }
}

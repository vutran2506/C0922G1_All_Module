package loop_java.bai_tap;



public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        boolean check = true;
        while (count< 20){
            for (int i = 2; i <=Math.sqrt(num) ; i++) {
                check = true;
                if( num % 2 == 0){
                       check = false;
                       break;
                }
            }
                if(check){
                    System.out.println("Số nguyên tố thứ "+(count+1) +" là: "+num);
                    count++;
                }
            num++;
        }
    }
}

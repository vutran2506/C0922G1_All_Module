package ss15_exception_debug.thuc_hanh;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     String email;
        System.out.println("Nhập email");
        do {
            try {
                email = scanner.nextLine();
                if (checkRegex(EMAIL_REGEX,email)){
                    System.out.println("Chúc mừng bạn đã nhập đúng");
                  break;
                }else {
                    throw  new EmailException("Bạn nhập sai email");
                }
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }while (true);
    }
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static boolean checkRegex(String regex,String input){
          return Pattern.matches(regex,input);

    }
}

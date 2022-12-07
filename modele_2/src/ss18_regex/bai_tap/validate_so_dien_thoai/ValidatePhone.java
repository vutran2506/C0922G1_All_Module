package ss18_regex.bai_tap.validate_so_dien_thoai;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String NUMBER_PHONE = "^\\d+([.]\\d+)?$" +
            "";
    private static Pattern pattern;

//    public   ValidatePhone() {
//        pattern = Pattern.compile(NUMBER_PHONE);
//
//    }
//
//    public boolean validate(String regex) {
//        Matcher matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String numberPhone = scanner.nextLine();

        System.out.println(numberPhone.matches(NUMBER_PHONE));
    }

}

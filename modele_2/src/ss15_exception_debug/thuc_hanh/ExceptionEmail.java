//package ss15_exception_debug.thuc_hanh;
//
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class Exception {
//    public Exception(String name) {
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//     String email;
//        System.out.println("Nhập email");
//        do {
//          email = scanner.nextLine();
//          if (checkRegex(EMAIL_REGEX,email)){
//
//              break;
//          }else {
//              try {
//                  throw  new EmailFoundException(" Bạn nhập email sai");
//              } catch (EmailFoundException e) {
//                  System.out.println(e.getMessage());
//                  System.out.println(" Mời bạn nhạp lai");
//              }
//          }
//        }while (true);
//    }
//    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    public static boolean checkRegex(String regex,String input){
//          return Pattern.matches(regex,input);
//
//    }
//}

package ss18_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name Class");
        String nameClass = scanner.nextLine();
        ValidateClassName validateClassName = new ValidateClassName();
        boolean isCheck = validateClassName.validate(nameClass);
        System.out.println(" ClassName "+nameClass+" is "+isCheck);
    }
}

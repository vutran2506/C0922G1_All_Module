package ss10_Stack_Queue.bai_tap.dao_nguoc_chuoi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi");
        String mWord = scanner.nextLine();

        String[] arrString = mWord.split(" ");
        Stack<String> stack = new Stack<>();

        int size = arrString.length;
        for (int i = 0; i < size; i++) {
            stack.push(arrString[i]);
        }


        System.out.println("Chuỗi đảo ngược");
        mWord = "";
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            mWord += stack.pop();
            mWord += " ";
        }


        System.out.println(mWord);
    }
}
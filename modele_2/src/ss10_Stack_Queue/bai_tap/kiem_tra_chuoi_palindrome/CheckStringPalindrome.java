package ss10_Stack_Queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        System.out.println("Nhập 1 chuỗi");
        String string = scanner.nextLine();
        String[] arr = string.toLowerCase().split("");
        String[] arr1 = new String[string.length()];
        boolean check = true;
        int size = arr.length;
        for (String s : arr) {
            stack.push(s);
            queue.add(s);
        }
        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
            arr1[i] = queue.poll();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < size; i++) {

            if (!arr[i].equals(arr1[i])) {
                check = false;
                break;
            }
        }
        if (check ) {
            System.out.println("Chuỗi này là chuỗi Palindrome");
        } else {
            System.out.println("Chuỗi này không phải là chuỗi palindrome");
        }


    }
}

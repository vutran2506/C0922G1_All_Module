package ss10_Stack_Queue.bai_tap.dao_nguoc_chuoi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayInteger {
    public static void main(String[] args) {
        Stack<Integer> stackDaySo =new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi số nguyên");
        int [] arr = new  int[5];
        int arrLength = arr.length;
        for (int i = 0; i <arrLength ; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Chuỗi ban đầu");
        for (int j : arr) {
            stackDaySo.push(j);
        }
        System.out.println(stackDaySo);

        System.out.println();
        System.out.println("Chuỗi đảo ngược");
        for (int i = 0; i < arrLength; i++) {
             arr[i] = stackDaySo.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}

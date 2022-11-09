package giai_thuat;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {8,7,2,5,3,1};
        System.out.println("Nhập giá trị so sánh");
        int num = Integer.parseInt(scanner.nextLine());
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = i+1; j <arrLength ; j++) {
                if(arr[i]+arr[j]==num){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                    break;
                }
            }
        }
    }
}

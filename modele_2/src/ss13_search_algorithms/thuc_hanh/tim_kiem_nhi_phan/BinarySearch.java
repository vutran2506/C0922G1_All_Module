package ss13_search_algorithms.thuc_hanh.tim_kiem_nhi_phan;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arrString = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("nhập  phần tử thứ  " + (i + 1));
            arrString[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrString));
        Arrays.sort(arrString);
        System.out.println(Arrays.toString(arrString));
        System.out.println("Nhập số cần tìm");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Số cần tìm nằm ở vị trí "
                +binarySearch(arrString,0,arrString.length-1,number)+" trong mảng");
    }

    public static int binarySearch(int[] arrString, int minLeft, int maxRight, int valueSearch) {
        if (maxRight >= minLeft) {
            int middle = (maxRight+ minLeft) / 2;
            if (arrString[middle]== valueSearch){
                return middle;
            }
            if (valueSearch > middle ){
               return binarySearch(arrString,middle+1,maxRight,valueSearch);
            }else {
                return binarySearch(arrString,minLeft,middle-1,valueSearch);
            }
        }else {
            return -1;
        }
    }
}

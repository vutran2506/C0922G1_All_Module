package ss1_introduction_to_java.thuc_hanh;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {25, 13, 2, 5, 98};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >i; j--) {
                int temp = arr[j];
                if (arr[j] - arr[j - 1] <0) {
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}

package ss3_array_java.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int [] arr1 = {0,1,2,3,4};
        int [] arr2 = {5,6,7,8,9,10};
        int [] arr3 = new int[arr1.length+ arr2.length];
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        for (int i = 0; i <lengthArr1 ; i++) {
            arr3[i]=arr1[i];
        }
        for (int i =0; i <lengthArr2 ; i++) {
            arr3[lengthArr1+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}

package ss10_Stack_Queue.bai_tap.Dem_so_lan_xuat_hien_trong_chuoi;

import java.util.*;

public class NumberOfTimeInTheString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi từ vào");
        String string = scanner.nextLine();

        String[] arrCacTu = string.split(" ");
        System.out.println(Arrays.toString(arrCacTu));
        Map<String, Integer> map = new TreeMap<>();
        int value = 0;
        for (String item : arrCacTu) {
            for (String s : arrCacTu) {
                if (Objects.equals(item, s)) {
                    value += 1;
                }
            }
            map.put(item, value);
            value = 0;
        }

        System.out.println("--------------------------");
        System.out.println(map);
    }
}

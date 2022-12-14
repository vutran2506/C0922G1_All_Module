package giai_thuat;

import java.util.*;

public class DemoJava {
    public static void main(String[] args) {
//        Hãy viết chương trình để tạo ra một map chứa (i, i*i), trong đó i là số nguyên từ 1 đến n (bao gồm cả 1 và n),
//        n được nhập từ bàn phím. Sau đó in map này ra màn hình.
//        Ví dụ: Giả sử số n là 8 thì đầu ra sẽ là: {1: 1, 2: 4, 3: 9, 4: 16, 5: 25, 6: 36, 7: 49, 8: 64}.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập vào đây");
//        int num = Integer.parseInt(scanner.nextLine());
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i <= num ; i++) {
//            map.put(i,i*i);
//        }
//        System.out.println(map);


//        Dãy số Fibonacci được định nghĩa như sau: F0 = 0, F1 = 1, F2 = 1, Fn = F(n-1) + F(n-2) với
//    n >= 2. Ví dụ: 0, 1, 1, 2, 3, 5, 8, ... Hãy viết chương trình tìm n số Fibonacci đầu tiên.
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.printf("Nhập vào đây");
        int num = Integer.parseInt(scanner.nextLine());
        int a =0;
        int b =1;
        list.add(a);
        list.add(b);
        int c;
        for (int i = 2; i < num; i++) {
            c = a+b;
            a = b ;
            b = c ;
            list.add(c);
        }
        System.out.println(list);
    }
}

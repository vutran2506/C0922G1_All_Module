package ss13_search_algorithms.bai_tap;

import java.util.*;

public class StringSort {
    public static void main(String[] args) {

        System.out.println("Nhập vào đây");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
//        Set<Character> characters = new TreeSet<>();
//        int size = string.length();
//        for (int i = 0; i < size; i++) {
//            characters.add(string.charAt(i));
//        }
//        System.out.println(characters);
        List<Character> characters = new LinkedList<>();
        int size = string.length();
        for (int i = 0; i < size; i++) {
            characters.add(string.charAt(i));
        }
    }
}

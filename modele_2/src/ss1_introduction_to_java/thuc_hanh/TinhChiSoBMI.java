package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoBMI {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  Your Weight:");
        weight = scanner.nextFloat();
        System.out.println("Enter  Your Height:");
        height = scanner.nextFloat();
        float result = weight/(height*height);
        if(result<18.5){
            System.out.println("UnderWeight");
        }else if(result<25){
            System.out.println("Normal");
        }else if(result<30){
            System.out.println("OverWeight");
        } else {
            System.out.println("Obese");
        }
    }
}

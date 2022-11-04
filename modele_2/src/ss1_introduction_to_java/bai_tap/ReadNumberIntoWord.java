package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumberIntoWord {
    public static void main(String[] args) {
        int numbers;
        String stringone = "";
        String stringten = "";
        String stringhundred = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        numbers = scanner.nextInt();
        if (numbers >= 0 && numbers <= 20) {
            switch (numbers) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eightteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
        } else if (numbers < 100) {
            int ones = numbers % 10;
            int tens = numbers / 10;
            switch (ones) {
                case 1:
                    stringone ="One";
                    break;
                case 2:
                    stringone ="Two";
                    break;
                case 3:
                    stringone ="Three";
                    break;
                case 4:
                    stringone ="four";
                    break;
                case 5:
                    stringone ="five";
                    break;
                case 6:
                    stringone ="six";
                    break;
                case 7:
                    stringone ="Seven";
                    break;
                case 8:
                    stringone ="eight";
                    break;
                case 9:
                    stringone ="nine";
                    break;
            }
            switch (tens){
                case 2:
                    stringten ="Twenty";
                    break;
                case 3:
                    stringten ="Thrity";
                    break;
                case 4:
                    stringten="fourty";
                    break;
                case 5:
                    stringten ="fivety";
                    break;
                case 6:
                    stringten ="sixty";
                    break;
                case 7:
                    stringten ="Seventy";
                    break;
                case 8:
                    stringten ="eighty";
                    break;
                case 9:
                    stringten ="ninety";
                    break;
            }
            System.out.println(stringten+" "+ stringone );
        }else  if(numbers<120){
            int tens = numbers -100;
            switch (tens){
                case 0:
                    System.out.println("One hudred");
                    break;
                case 1:
                    System.out.println("One hundred one");
                    break;
                case 2:
                    System.out.println(" One hundred Two");
                    break;
                case 3:
                    System.out.println(" One hundred Three");
                    break;
                case 4:
                    System.out.println(" One hundred four");
                    break;
                case 5:
                    System.out.println(" One hundred five");
                    break;
                case 6:
                    System.out.println("One hundred six");
                    break;
                case 7:
                    System.out.println(" One hundred Seven");
                    break;
                case 8:
                    System.out.println(" One hundred eight");
                    break;
                case 9:
                    System.out.println(" One hundred nine");
                    break;
                case 10:
                    System.out.println("One hundred ten");
                    break;
                case 11:
                    System.out.println(" one hundred eleven");
                    break;
                case 12:
                    System.out.println("one hundred twelve");
                    break;
                case 13:
                    System.out.println("one hundred thirteen");
                    break;
                case 14:
                    System.out.println("one hundred fourteen");
                    break;
                case 15:
                    System.out.println("one hundred fifteen");
                case 16:
                    System.out.println("one hundred sixteen");
                    break;
                case 17:
                    System.out.println("one hundred seventeen");
                    break;
                case 18:
                    System.out.println("one hundred eightteen");
                    break;
                case 19:
                    System.out.println("one hundred nineteen");
                    break;
            }
        } else if ( numbers < 1000) {
            int ones = numbers % 10;
            int tens = (numbers-(numbers/100)*100)/10;
            int hundred = numbers/100;
            switch (ones) {
                case 1:
                    stringone ="One";
                    break;
                case 2:
                    stringone ="Two";
                    break;
                case 3:
                    stringone ="Three";
                    break;
                case 4:
                    stringone ="four";
                    break;
                case 5:
                    stringone ="five";
                    break;
                case 6:
                    stringone ="six";
                    break;
                case 7:
                    stringone ="Seven";
                    break;
                case 8:
                    stringone ="eight";
                    break;
                case 9:
                    stringone ="nine";
                    break;
            }
            switch (tens){
                case 2:
                    stringten ="Twenty";
                    break;
                case 3:
                    stringten ="Thrity";
                    break;
                case 4:
                    stringten="fourty";
                    break;
                case 5:
                    stringten ="fivety";
                    break;
                case 6:
                    stringten ="sixty";
                    break;
                case 7:
                    stringten ="Seventy";
                    break;
                case 8:
                    stringten ="eighty";
                    break;
                case 9:
                    stringten ="ninety";
                    break;
            }
            switch (hundred){
                case 1:
                    stringhundred =  "One hundred";
                    break;
                case 2:
                    stringhundred = "Two hundred";
                    break;
                case 3:
                    stringhundred = "Three hundred";
                    break;
                case 4:
                    stringhundred = "four hundred";
                    break;
                case 5:
                    stringhundred = "five hundred";
                    break;
                case 6:
                    stringhundred =  "six hundred";
                    break;
                case 7:
                    stringhundred = "Seven hundred";
                    break;
                case 8:
                    stringhundred = "eight hundred";
                    break;
                case 9:
                    stringhundred = "nine hundred";
                    break;
            }
            System.out.println(stringhundred+ " "+stringten+ " "+stringone);
            }
    }
}

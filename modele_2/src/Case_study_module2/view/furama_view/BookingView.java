package Case_study_module2.view.furama_view;

import Case_study_module2.controller.BookingController;

import java.util.Scanner;

public class BookingView {
    private  final BookingController bookingController = new BookingController();
    public  void displayBooking(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=======Booking Management=======");
            System.out.println("""
                                1.	Add new booking
                                2.	Display list booking
                                3.	Return main menu
                                
                                """);
            System.out.println("Input your choice");
            int choice4;
            try {
                choice4 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (choice4) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                 return;
                default:
                    System.out.println("Input choice 1 to 3");
            }
        } while (true);
    }
}

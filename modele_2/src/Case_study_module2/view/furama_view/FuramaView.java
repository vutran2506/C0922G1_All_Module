package Case_study_module2.view.furama_view;

import java.util.Scanner;

public class FuramaView {
    private final EmployeeView employeeView = new EmployeeView();
    private final CustomerView customerView = new CustomerView();
    private final FacilityView facilityView = new FacilityView();
    private final BookingView bookingView = new BookingView();
    private final PromotionView promotionView = new PromotionView();

    public  void displayMenuFarama() {
        Scanner scanner = new Scanner(System.in);
        do {
            menuFurama();
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (choice) {
                case 1:
                    employeeView.displayEmployee();
                    break;
                case 2:
                    customerView.displayCustomer();
                    break;
                case 3:
                    facilityView.displayFacility();
                    break;
                case 4:
                    bookingView.displayBooking();
                    break;
                case 5:
                    promotionView.displayPromotion();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Input choice 1 to 6");
            }
        } while (true);
    }

    public  void menuFurama() {
        System.out.println("======== FURAMA Management =======");
        System.out.println("""
                1.	Employee Management
                2.	Customer Management
                3.	Facility Management
                4.	Booking Management
                5.	Promotion Management
                6.	Exit              
                """);
        System.out.println("Input your choice");
    }
}
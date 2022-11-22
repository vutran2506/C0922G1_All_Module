package Case_study_module2.Controller;



import java.util.Scanner;

public class ManagerFuramaResort {
    Scanner scanner = new Scanner(System.in);
    public static  void menuManager(){
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n");
        int choice = choice();
        switch (choice){
            case 1:
                EmployeeManagerController employeeController = new EmployeeManagerController();
                employeeController.display();
                break;
            case 2:
                CustomerManagerController customerController = new CustomerManagerController();
                customerController.display();
                break;
            case 3:
                FacilityController facilityController = new FacilityController();
                facilityController.display();
                break;
            case 4:
                BookingController bookingController = new BookingController();
                bookingController.display();
                break;
            case 5:
                PromotionController promotionController = new PromotionController();
                promotionController.display();
                break;
            case 6:
                break;
        }
    }
     public static int choice(){
        Scanner scanner1 = new Scanner(System.in);
         System.out.println("Nhập lựa chọn vào đây");
         int choice = Integer.parseInt(scanner1.nextLine());
         return choice;
     }
}

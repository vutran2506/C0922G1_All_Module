package Case_study_module2.View;

import Case_study_module2.Controller.FacilityController;

import java.util.Scanner;

public class FacilityView {
    private  final FacilityController facilityController = new FacilityController();
    public  void facilityDisplay(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("========Facility Management=======");
            System.out.println("""
                                1	Display list facility
                                2	Add new facility
                                3	Display list facility maintenance
                                4	Return main menu
                                """);
            System.out.println("Input your choice");
            int choice3;
            try {
                choice3 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (choice3) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Input choice 1 to 4");
            }
        } while (true);
    }
}

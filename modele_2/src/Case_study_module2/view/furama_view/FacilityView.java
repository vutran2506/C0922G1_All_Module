package Case_study_module2.view.furama_view;

import Case_study_module2.controller.FacilityController;
import Case_study_module2.model.Facility;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private  final FacilityController facilityController = new FacilityController();
    private final MenuFacilityView menuFacilityView = new MenuFacilityView();
    public  void displayFacility(){
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
                    for (Map.Entry<Facility,Integer> map:facilityController.getListFacility().entrySet()) {
                        System.out.println(map);
                    }
                    facilityController.getListFacility();
                    break;
                case 2:
               menuFacilityView.displayAddFacility();
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

package Case_study_module2.view.furama_view;

import Case_study_module2.controller.RoomController;
import Case_study_module2.controller.VillaController;
import Case_study_module2.model.Room;
import Case_study_module2.model.Villa;

import java.util.Scanner;

public class MenuFacilityView {
    private  final RoomController roomController = new RoomController();
    private  final VillaController villaController = new VillaController();

     public  void displayAddFacility() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int  countUseRoom = 0;
        int countUseVilla = 0;
        do {
            System.out.println("=========Add new Facility======");
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New Room\n" +
                    "3.\tBack to menu\n");
            System.out.println("Input choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Input name Service");
                    String nameService = scanner.nextLine();
                    System.out.println("Input use area");
                    double useAreaVilla = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input rent cost");
                    double rentCostVilla = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input maximum of number people");
                    int maximumOfNumberPeopleVilla = Integer.parseInt(scanner.nextLine());
                    System.out.println("input rent type");
                    String rentTypeVilla = scanner.nextLine();
                    System.out.println("Input roomStandard");
                    String roomStandardVilla = scanner.nextLine();
                    System.out.println("Input poolArea");
                    double poolAreaVilla = Double.parseDouble(scanner.nextLine());
                    System.out.println(" Input floorNumber");
                    int floorNumberVilla = Integer.parseInt(scanner.nextLine());
                    Villa villa = new Villa(nameService, useAreaVilla, rentCostVilla, maximumOfNumberPeopleVilla, rentTypeVilla,
                            roomStandardVilla, poolAreaVilla, floorNumberVilla);
                    countUseVilla++;
                    villaController.addVilla(villa, countUseVilla);
                    break;
                case 2:
                    System.out.println("Input name Service");
                    String nameServiceVilla = scanner.nextLine();
                    System.out.println("Input use area");
                    double useArea = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input rent cost");
                    double rentCost = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input maximum of number people");
                    int maximumOfNumberPeople = Integer.parseInt(scanner.nextLine());
                    System.out.println("input rent type");
                    String rentType = scanner.nextLine();
                    System.out.println(" Input free service");
                    String freeService = scanner.nextLine();
                    Room room = new Room(nameServiceVilla, useArea, rentCost, maximumOfNumberPeople, rentType, freeService);
                    countUseRoom++;
                    roomController.addRoom(room, countUseRoom);
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}

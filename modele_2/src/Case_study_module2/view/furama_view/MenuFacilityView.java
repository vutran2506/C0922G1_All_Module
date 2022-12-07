package Case_study_module2.view.furama_view;

import Case_study_module2.common.Regex;
import Case_study_module2.controller.RoomController;
import Case_study_module2.controller.VillaController;
import Case_study_module2.model.Room;
import Case_study_module2.model.Villa;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MenuFacilityView {
    private final RoomController roomController = new RoomController();
    private final VillaController villaController = new VillaController();

    public void displayAddFacility() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int countUseRoom = 0;
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
                    System.out.println("Input ID");
                    String id;
                    do {
                        id = scanner.nextLine();
                        if (validate(Regex.ID_VILLA_REGEX,id)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please SVVL-YYYY");
                        }
                    } while (true);
                    System.out.println("Input name Service");
                    String nameServiceVilla;
                    do {
                        nameServiceVilla = scanner.nextLine();
                        if (validate(Regex.NAME_REGEX,nameServiceVilla)) {
                            break;
                        } else {
                            System.out.println("Incorrect input,please input alphabet Yyyyy");
                        }
                    } while (true);

                    System.out.println("Input use area");
                    String rentCostVillaScenner;
                    do {
                        rentCostVillaScenner = scanner.nextLine();
                        if (validate(Regex.USE_AREA, rentCostVillaScenner)) {
                            break;
                        }else {
                            System.out.println("Incorrect input,please input number");
                        }
                    } while (true);
                    double useAreaVilla = Double.parseDouble(rentCostVillaScenner);
                    System.out.println("Input rent cost");
                    String rentCostVillaScanner;
                    do {
                        rentCostVillaScanner = scanner.nextLine();
                        if (validate(Regex.RENT_COST_REGEX, rentCostVillaScanner)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input number");
                        }
                    }while (true);
                    double rentCostVilla = Double.parseDouble(rentCostVillaScanner);

                    System.out.println("Input maximum of number people");
                    String maximumOfNumberPeopleVillaScanner;
                    do {
                        maximumOfNumberPeopleVillaScanner = scanner.nextLine();
                        if (validate(Regex.MAXIMUM_NUMBER_USER_REGEX, maximumOfNumberPeopleVillaScanner)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input number");
                        }
                    }while (true);
                    int maximumOfNumberPeopleVilla = Integer.parseInt(maximumOfNumberPeopleVillaScanner);

                    System.out.println("input rent type");
                    String rentTypeVilla;
                    do {
                        rentTypeVilla = scanner.nextLine();
                        if (validate(Regex.RENT_TYPE_REGEX,rentTypeVilla)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please alphabet Yyyy");
                        }
                    }while (true);

                    System.out.println("Input roomStandard");
                    String roomStandardVilla;
                    do {
                         roomStandardVilla = scanner.nextLine();
                         if (validate(Regex.ROOM_STANDARD_REGEX,roomStandardVilla)){
                             break;
                         }else {
                             System.out.println("Incorrect input,please alphabet Xxxx");
                         }
                    }while (true);

                    System.out.println("Input poolArea");
                    String poolAreaVillaScanner;
                    do {
                        poolAreaVillaScanner = scanner.nextLine();
                        if (validate(Regex.AREA_POOL_REGEX, poolAreaVillaScanner)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input number");
                        }
                    }while (true);
                    double poolAreaVilla = Double.parseDouble(poolAreaVillaScanner);
                    System.out.println(" Input floorNumber");
                    String floorNumberVillaScanner;
                    do {
                        floorNumberVillaScanner = scanner.nextLine();
                        if (Pattern.matches(Regex.FLOOR_NUMBER_REGEX,floorNumberVillaScanner)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input number");
                        }
                    }while (true);
                    int floorNumberVilla = Integer.parseInt(floorNumberVillaScanner);

                    Villa villa = new Villa(id,nameServiceVilla, useAreaVilla, rentCostVilla,maximumOfNumberPeopleVilla, rentTypeVilla,
                            roomStandardVilla, poolAreaVilla, floorNumberVilla);
                    countUseVilla++;
                    villaController.addVilla(villa, countUseVilla);
                    break;
                case 2:
                    System.out.println("Input id Room");
                    String idRoom ;
                    do {
                        idRoom = scanner.nextLine();
                        if (validate(Regex.ID_ROOM_REGEX,idRoom)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input SVRO-YYYY");
                        }
                    }while (true);
                    System.out.println("Input name Service");
                    String nameService;
                    do {
                        nameService = scanner.nextLine();
                        if (validate(Regex.NAME_REGEX,nameService)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input alphabet Xxxx");
                        }
                    }while (true);
                    System.out.println("Input use area");
                    String useAreaScanner;
                    do {
                        useAreaScanner = scanner.nextLine();
                        if (validate(Regex.USE_AREA,useAreaScanner)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input number");
                        }
                    }while (true);
                    double useArea = Double.parseDouble(useAreaScanner);
                    System.out.println("Input rent cost");
                    String renCostScanner;
                    do {
                     renCostScanner = scanner.nextLine();
                     if (validate(Regex.RENT_COST_REGEX,renCostScanner)){
                         break;
                     }else {
                         System.out.println("Incorrect input,please input number");
                     }
                    }while (true);
                     double renCost = Double.parseDouble(renCostScanner);

                    System.out.println("Input maximum of number people");
                    String maximumOfNumberPeopleScanner;
                    do {
                        maximumOfNumberPeopleScanner = scanner.nextLine();
                        if (validate(Regex.MAXIMUM_NUMBER_USER_REGEX,maximumOfNumberPeopleScanner)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input number");
                        }
                    }while (true);
                    int maximumOfNumberPeople = Integer.parseInt(maximumOfNumberPeopleScanner);
                    System.out.println("input rent type");
                    String rentType;
                    do {
                        rentType = scanner.nextLine();
                        if (validate(Regex.RENT_TYPE_REGEX,rentType)){
                            break;
                        }else {
                            System.out.println("Incorrect input,please input alphabet Xxxx");
                        }
                    }while (true);
                    System.out.println(" Input free service");
                    String freeService;
                    do {
                        freeService = scanner.nextLine();
                        if (validate(Regex.FREE_SERVICE,freeService)){
                            break;
                        }else {

                        }
                    } while (true);

                    Room room = new Room(idRoom,nameService, useArea, renCost, maximumOfNumberPeople, rentType, freeService);
                    countUseRoom++;
                    roomController.addRoom(room, countUseRoom);
                    break;
                case 3:
                    return;
            }
        } while (true);
    }

    public static boolean validate(String regex, String input) {
        return Pattern.matches(regex, input);
    }

}

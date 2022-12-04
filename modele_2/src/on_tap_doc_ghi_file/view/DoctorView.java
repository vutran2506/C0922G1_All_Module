package on_tap_doc_ghi_file.view;

import on_tap_doc_ghi_file.controller.DoctorController;
import on_tap_doc_ghi_file.model.Doctor;

import java.util.Scanner;

public class DoctorView {
    private final DoctorController doctorController = new DoctorController();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        int choice;
        do {
            System.out.println("=======MENU=======");
            System.out.println("""
                    1: Display list doctor\s
                    2: Add new doctor
                    3: Edit doctor
                    4: Delete Doctor
                    5: Exit""");

                try {
                    System.out.println(" Input your choice number ");
                    choice = Integer.parseInt(scanner.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    continue;
                }


            switch (choice) {
                case 1:
                    for (Doctor doctor: doctorController.displayDoctor()) {
                        System.out.println(doctor);
                    }
                    break;
                case 2:
                    System.out.println("Input id Doctor");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name Doctor ");
                    String name = scanner.nextLine();
                    System.out.println("Input Salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    Doctor doctor = new Doctor(id, name, salary);
                    doctorController.addDoctor(doctor);
                    break;
                case 3:
                    System.out.println("Input the id to edit ");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input new name");
                    String nameEdit = scanner.nextLine();
                    System.out.println("Input new Salary");
                    double salaryEdit = Double.parseDouble(scanner.nextLine());
                    Doctor doctor1 = new Doctor(idEdit, nameEdit, salaryEdit);
                    doctorController.editDoctor(doctor1);
                    break;
                case 4:
                    System.out.println("Input delete id");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    doctorController.deleteDoctor(idDelete);
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Choice 1 to 5");
            }
        } while (true);
    }
}

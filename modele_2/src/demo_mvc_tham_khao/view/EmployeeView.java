package demo_mvc_tham_khao.view;

import demo_mvc_tham_khao.controller.EmployeeController;
import demo_mvc_tham_khao.exception.ExistedEmployeeException;
import demo_mvc_tham_khao.model.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();

    public void displayMenu() {
        do {
            System.out.println("=========MENU=====");
            System.out.println("1: Display Menu");
            System.out.println("2: Add new Employee");
            System.out.println("3: Edit Employee");
            System.out.println("4: Delete Employee");
            System.out.println("5: Exit Menu");
            System.out.println(" Enter choice number");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Employee> list = this.employeeController.displayEmployee();
                    if (list == null) {
                        break;
                    }
                    for (Employee e : list) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("Input id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name");
                    String name = scanner.nextLine();
                    System.out.println("Input Age");
                    double age = Double.parseDouble(scanner.nextLine());
                    Employee employee = new Employee(id, name, age);
                    try {
                        this.employeeController.addEmployee(employee);
                    } catch (ExistedEmployeeException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.println(" Input id update Employee");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input new name");
                    String newName = scanner.nextLine();
                    System.out.println("Input new Age");
                    double newAge = Double.parseDouble(scanner.nextLine());
                    Employee employeeUpdate = new Employee(idUpdate, newName, newAge);
                    this.employeeController.editEmployee(employeeUpdate);
                    break;
                case 4:
                    System.out.println("Input id Delete");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    this.employeeController.deleteEmployee(idDelete);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("choice 1 to 5");
            }
        } while (true);
    }
}

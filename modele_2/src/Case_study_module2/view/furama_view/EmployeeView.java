package Case_study_module2.view.furama_view;

import Case_study_module2.common.Regex;
import Case_study_module2.controller.EmployeeController;
import Case_study_module2.model.Employee;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeView  {
    private final EmployeeController employeeController = new EmployeeController();

    public void displayEmployee() {
     final Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========Employee Management =======");
            System.out.println("""
                    1\tDisplay list employees
                    2\tAdd new employee
                    3\tDelete employee
                    4\tEdit employee
                    5\tReturn main menu
                    """);
                try {
                    System.out.println("Input your choice");
                     choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            switch (choice) {
                case 1:
                    List<Employee> employeeList = employeeController.displayEmployee();
                    if (employeeList.isEmpty()){
                        System.out.println(" List isEmpty");
                        break;
                    }
                    for (Employee e: employeeList) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println(" Input id Employee");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name Employee");
                    String name = scanner.nextLine();
                    System.out.println("Input date of birth Employee");
                    String dateOfBirth;
                    do {
                        dateOfBirth = scanner.nextLine();
                        if (validate(Regex.DATE_FORMAT,dateOfBirth)){
                            break;
                        }else {
                            System.out.println("Format by dd/mm/YYYY ");
                        }
                    }while (true);

                    System.out.println("Input sex Employee");
                    String sex = scanner.nextLine();
                    System.out.println("Input id number Employee");
                    String idNumber = scanner.nextLine();
                    System.out.println("Input Phone Employee");
                    String phone = scanner.nextLine();
                    System.out.println("input Email Employee");
                    String email = scanner.nextLine();
                    System.out.println("Input level Employee");
                    String level = scanner.nextLine();
                    System.out.println("Input position Employee");
                    String position = scanner.nextLine();
                    System.out.println("Input salary Employee");
                    double salary = Double.parseDouble(scanner.nextLine());
                    Employee employee = new Employee(id,name,dateOfBirth,sex,idNumber,phone,email,level,position,salary);
                    this.employeeController.addEmployee(employee);
                    break;
                case 3:
                    System.out.println("Input id delete Employee");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    this.employeeController.deleteEmployee(idDelete);
                    break;
                case 4:
                    System.out.println("Input idUpdate Employee");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input new name Employee");
                    String newName = scanner.nextLine();
                    System.out.println("Input new date of birth Employee");
                    String newDateOfBirth = scanner.nextLine();
                    System.out.println("Input new sex Employee");
                    String newSex = scanner.nextLine();
                    System.out.println("Input new í number Employee");
                    String newIdNumber = scanner.nextLine();
                    System.out.println("Input new Phone Employee");
                    String newPhone = scanner.nextLine();
                    System.out.println("input new Email Employee");
                    String newEmail = scanner.nextLine();
                    System.out.println("Input new level Employee");
                    String newLevel = scanner.nextLine();
                    System.out.println("Input new position Employee");
                    String newPosition = scanner.nextLine();
                    System.out.println("Input new salary Employee");
                    double newSalary = Double.parseDouble(scanner.nextLine());
                    Employee employee1 = new Employee(idUpdate,newName,newDateOfBirth,newSex,newIdNumber,newPhone,
                            newEmail,newLevel,newPosition,newSalary);
                    this.employeeController.editEmployee(employee1);
                    break;

                case 5:
                 return;
                default:
                    System.out.println("Input choice 1 to 5");
            }
        } while (true);
    }
    public static boolean validate(String regex, String input) {
        return Pattern.matches(regex, input);
    }
}

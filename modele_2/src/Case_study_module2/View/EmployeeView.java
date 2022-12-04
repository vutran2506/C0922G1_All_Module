package Case_study_module2.View;

import Case_study_module2.Controller.EmployeeController;
import Case_study_module2.Model.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView  {
    private final EmployeeController employeeController = new EmployeeController();



    public void employeeDisplay() {
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
                    System.out.println(" Input ma so Employee");
                    int maSo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input ten Employee");
                    String ten = scanner.nextLine();
                    System.out.println("Input ngay sinh Employee");
                    String ngaySinh = scanner.nextLine();
                    System.out.println("Input gioi tính Employee");
                    String gioiTinh = scanner.nextLine();
                    System.out.println("Input CMND Employee");
                    String cMND = scanner.nextLine();
                    System.out.println("Input Phone Employee");
                    String phone = scanner.nextLine();
                    System.out.println("input Email Employee");
                    String email = scanner.nextLine();
                    System.out.println("Input trinh dọ Employee");
                    String trinhDo = scanner.nextLine();
                    System.out.println("Input vi tri Employee");
                    String viTri = scanner.nextLine();
                    System.out.println("Input luong Employee");
                    double luong = Double.parseDouble(scanner.nextLine());
                    Employee employee = new Employee(maSo,ten,ngaySinh,gioiTinh,cMND,phone,email,trinhDo,viTri,luong);
                    this.employeeController.addEmployee(employee);
                    break;
                case 3:
                    System.out.println("Input id delete Employee");
                    int id = Integer.parseInt(scanner.nextLine());
                    this.employeeController.deleteEmployee(id);
                    break;
                case 4:
                    System.out.println("Input idUpdate Employee");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input new ten Employee");
                    String newTen = scanner.nextLine();
                    System.out.println("Input new ngay sinh Employee");
                    String newNgaySinh = scanner.nextLine();
                    System.out.println("Input new gioi tính Employee");
                    String newGioiTinh = scanner.nextLine();
                    System.out.println("Input new CMND Employee");
                    String newCMND = scanner.nextLine();
                    System.out.println("Input new Phone Employee");
                    String newPhone = scanner.nextLine();
                    System.out.println("input new Email Employee");
                    String newEmail = scanner.nextLine();
                    System.out.println("Input new trinh dọ Employee");
                    String newTrinhDo = scanner.nextLine();
                    System.out.println("Input new vi tri Employee");
                    String newViTri = scanner.nextLine();
                    System.out.println("Input new luong Employee");
                    double newLuong = Double.parseDouble(scanner.nextLine());
                    Employee employee1 = new Employee(idUpdate,newTen,newNgaySinh,newGioiTinh,newCMND,newPhone,
                            newEmail,newTrinhDo,newViTri,newLuong);
                    this.employeeController.editEmployee(employee1);
                    break;
                case 5:
                 return;
                default:
                    System.out.println("Input choice 1 to 5");
            }
        } while (true);
    }
}

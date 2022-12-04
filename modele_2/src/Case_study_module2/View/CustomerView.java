package Case_study_module2.View;

import Case_study_module2.Controller.CustomerController;
import Case_study_module2.Model.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final CustomerController customerController = new CustomerController();

    public void customerDisplay() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("========Customer Management=======");
            System.out.println("""
                                    1.	Display list customers
                                    2.	Add new customer
                                    3.	Edit customer
                                    4.	Return main menu
                                                                    
                                """);
            System.out.println("Input your choice");
            int choice2;
            try {
                choice2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (choice2) {
                case 1:
                    List<Customer> customerList = this.customerController.displayCustomer();
                    if (customerList.isEmpty()){
                        System.out.println(" List isEmpty");
                    }
                    for (Customer c: customerList) {
                        System.out.println(c);
                    }
                    break;
                case 2:
                    System.out.println("Input ma so Customer");
                    int maSo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input ten Customer");
                    String ten = scanner.nextLine();
                    System.out.println("Input ngay sinh Customer");
                    String ngaySinh = scanner.nextLine();
                    System.out.println("Input gioi tinh Customer ");
                    String  gioiTinh = scanner.nextLine();
                    System.out.println("Input CMND Customer");
                    String cMND = scanner.nextLine();
                    System.out.println("Input phone Customer");
                    String phone = scanner.nextLine();
                    System.out.println("Input Email Customer");
                    String email = scanner.nextLine();
                    System.out.println("Input loại khach Customer");
                    String loaiKhach = scanner.nextLine();
                    System.out.println("Input dia chi Customer");
                    String diaChi = scanner.nextLine();
                    Customer customer = new Customer(maSo,ten,ngaySinh,gioiTinh,cMND,phone,email,loaiKhach,diaChi);
                    this.customerController.addCustomer(customer);
                    break;
                case 3:
                    System.out.println(" Input idUpdate Customer");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input new ten Customer");
                    String newTen = scanner.nextLine();
                    System.out.println("Input new  ngay sinh Customer");
                    String newNgaySinh = scanner.nextLine();
                    System.out.println("Input new  gioi tinh Customer ");
                    String  newGioiTinh = scanner.nextLine();
                    System.out.println("Input new  CMND Customer");
                    String newCMND = scanner.nextLine();
                    System.out.println("Input new  phone Customer");
                    String newPhone = scanner.nextLine();
                    System.out.println("Input new  Email Customer");
                    String newEmail = scanner.nextLine();
                    System.out.println("Input  new loại khach Customer");
                    String newLoaiKhach = scanner.nextLine();
                    System.out.println("Input new  dia chi Customer");
                    String newDiaChi = scanner.nextLine();
                    Customer customer1 = new Customer(idUpdate,newTen,newNgaySinh,newGioiTinh,
                            newCMND,newPhone,newEmail,newLoaiKhach,newDiaChi);
                    this.customerController.editCustomer(customer1);
                    break;
                case 4:
              return;
                default:
                    System.out.println("Input choice 1 to 4");
            }
        } while (true);
    }
}

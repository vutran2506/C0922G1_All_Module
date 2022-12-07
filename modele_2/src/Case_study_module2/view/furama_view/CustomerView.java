package Case_study_module2.view.furama_view;

import Case_study_module2.common.Regex;
import Case_study_module2.controller.CustomerController;
import Case_study_module2.model.Customer;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerView {
    private final CustomerController customerController = new CustomerController();

    public void displayCustomer() {
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
                    System.out.println("Input id Customer");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name Customer");
                    String name = scanner.nextLine();
                    System.out.println("Input date of birth Customer");
                    String dateOfBirth ;
                    do {
                        dateOfBirth = scanner.nextLine();
                        if (validate(Regex.DATE_FORMAT,dateOfBirth)){
                            break;
                        }else {
                            System.out.println("Format by dd/mm/YYYY ");
                        }
                    }while (true);

                    System.out.println("Input sex Customer ");
                    String  sex = scanner.nextLine();
                    System.out.println("Input id number Customer");
                    String idNumber = scanner.nextLine();
                    System.out.println("Input phone Customer");
                    String phone = scanner.nextLine();
                    System.out.println("Input Email Customer");
                    String email = scanner.nextLine();
                    System.out.println("Input  customer type");
                    String customerType = scanner.nextLine();
                    System.out.println("Input address Customer");
                    String address = scanner.nextLine();
                    Customer customer = new Customer(id,name,dateOfBirth,sex,idNumber,phone,email,customerType,address);
                    this.customerController.addCustomer(customer);
                    break;
                case 3:
                    System.out.println(" Input idUpdate Customer");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input new name Customer");
                    String newName = scanner.nextLine();
                    System.out.println("Input new  date od birth Customer");
                    String newDateOfBirth = scanner.nextLine();
                    System.out.println("Input new  sex Customer ");
                    String  newSex = scanner.nextLine();
                    System.out.println("Input new id number Customer");
                    String newIdNUmber = scanner.nextLine();
                    System.out.println("Input new  phone Customer");
                    String newPhone = scanner.nextLine();
                    System.out.println("Input new  Email Customer");
                    String newEmail = scanner.nextLine();
                    System.out.println("Input  new customer type Customer");
                    String newCustomerType = scanner.nextLine();
                    System.out.println("Input new  address Customer");
                    String newAddress = scanner.nextLine();
                    Customer customer1 = new Customer(idUpdate,newName,newDateOfBirth,newSex,
                            newIdNUmber,newPhone,newEmail,newCustomerType,newAddress);
                    this.customerController.editCustomer(customer1);
                    break;
                case 4:
              return;
                default:
                    System.out.println("Input choice 1 to 4");
            }
        } while (true);
    }
    public static boolean validate(String regex, String input) {
        return Pattern.matches(regex, input);
    }
}

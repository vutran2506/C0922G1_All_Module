package ss17_BinaryFile_Serialization.bai_tap.view;

import ss17_BinaryFile_Serialization.bai_tap.controller.ControllerProduct;
import ss17_BinaryFile_Serialization.bai_tap.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView  {
    Scanner scanner = new Scanner(System.in);
    ControllerProduct controllerProduct = new ControllerProduct();

    public void displayMenu() {
        System.out.println("==============MENU==========");
        System.out.println("1: Add new Product");
        System.out.println("2: Display Product");
        System.out.println("3: Search Product");
        System.out.println("4: Exit Menu");
    }

    public void menu() {
        while (true) {
            displayMenu();
            System.out.println("Enter choice number");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter name product");
                    String name = scanner.nextLine();
                    System.out.println("Enter brand product");
                    String brand = scanner.nextLine();
                    System.out.println("Enter price product");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println(" Enter otherDescription");
                    String description = scanner.nextLine();
                    Product product = new Product(id, name, brand, price, description);
                    controllerProduct.addProduct(product);
                    break;
                case 2:
                    List<Product> productList = controllerProduct.displayProduct();

                    for (Product p : productList) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Input Id");
                    int inputId = Integer.parseInt(scanner.nextLine());
                     boolean checkProduct = controllerProduct.searchProduct(inputId);
                    if (checkProduct) {
                        for (Product p: controllerProduct.displayProduct()) {
                            if (p.getId() == inputId) {
                                System.out.println(p);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Id này không tồn tại");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Input 1 to 4");
            }
        }
    }
}

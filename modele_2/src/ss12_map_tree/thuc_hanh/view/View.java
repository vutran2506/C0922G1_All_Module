package ss12_map_tree.thuc_hanh.view;

import ss12_map_tree.thuc_hanh.controller.ProductController;
import ss12_map_tree.thuc_hanh.model.Product;
import ss12_map_tree.thuc_hanh.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private final Scanner scanner = new Scanner(System.in);
    private  final ProductController productController = new ProductController();
    public  void displayProductMenu(){
        while (true){
            System.out.println("Menu");
            System.out.println("1.Get all");
            System.out.println("2.Add new Product");
            System.out.println("Mời bạn lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    List<Product> products = this.productController.getAll();
                    for (Product p:
                         products) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá");
                    double price = Double.parseDouble(scanner.nextLine());

                    Product product = new Product(id,name,price);
                    this.productController.addProduct(product);
                    break;
                default:
                    System.out.println("---------------------------");

            }
        }
    }
}

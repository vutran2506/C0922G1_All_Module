package ss12_map_tree.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        Product product = new Product();
        System.out.println("Mời bạn nhập id sản phẩm");
        product.setIdProduct(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời bạn nhập tên sản phẩm");
        product.setNameProduct(scanner.nextLine());
        System.out.println("Mời bạn nhập giá sản phẩm");
        product.setPriceProduct(Double.parseDouble(scanner.nextLine()));
        productList.add(product);
    }

    public void deleteProduct() {
        display();
        System.out.println("Mời bạn nhập id cần xoá");
        int id = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            check= true;
            if (productList.get(i).getIdProduct()==(id)) {
                productList.remove(productList.get(i));
                System.out.println("Đã xoá sản phẩm");
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm ở vị trí id = " + id);
        }

    }

    public void editProduct() {
        System.out.println("Mời bạn nập id sản phẩm cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            check = true;
            if (productList.get(i).getIdProduct()==(id)) {
                System.out.println("Sửa lại id sản phẩm");
                productList.get(i).setIdProduct(Integer.parseInt(scanner.nextLine()));
                System.out.println("Sửa lại tên sản phẩm");
                productList.get(i).setNameProduct(scanner.nextLine());
                System.out.println("Sửa lại giá sản phẩm");
                productList.get(i).setPriceProduct(Integer.parseInt(scanner.nextLine()));
                System.out.println("Đã sửa sản phẩm");
                break;
            } else {
                check = false;
            }

        }
        if (!check) {
            System.out.println("Không có sản phẩm nào hiện có id =  " + id);
        }

    }

    public void display() {
        for (Product product :
                productList) {
            System.out.println(product);
        }
    }

    public void findProduct() {
        System.out.println("Nhập tên sản phẩm");
        String names = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            check= true;
            if (names.equals(productList.get(i).getNameProduct())) {
                System.out.println("Sản phẩm này có id là " + productList.get(i).getIdProduct() +
                        " và có giá là " + productList.get(i).getPriceProduct());
                break;
            } else {
                check= false;
            }
        }
        if (!check){
            System.out.println("Không có sản phẩm này trong danh sách");
        }

    }

    public void sortProduct() {
        ProductComparatorIncrease productComparator = new ProductComparatorIncrease();
        Collections.sort(productList, productComparator);
        for (Product product :
                productList) {
            System.out.println(product.toString());
        }
    }

}

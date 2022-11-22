package ss12_map_tree.bai_tap;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---------Menu-------");
            System.out.println("""
                    1.\t Thêm sản phẩm\s
                    2.\tSửa sản phẩm
                    3.\tXóa sản phẩm\s
                    4.\tHiển thị danh sách
                    5.\tTìm kiếm
                    6.\tSắp xếp
                    7.\tThoát""");
            System.out.println("Mời bạn nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.findProduct();
                    break;
                case 6:
                    productManager.sortProduct();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Chỉ lựa chọn từ 1 đến 7");
            }
        } while (choice != 7);

    }

}

package ss17_BinaryFile_Serialization.bai_tap.service;

import ss17_BinaryFile_Serialization.bai_tap.model.Product;

import java.io.*;
import java.util.List;

// Tạo class Service implement lại interface triển khai lại các phương thức.
public class ProductService implements IProductService {
    private static final String FILE_PATH = "src/ss17_BinaryFile_Serialization/bai_tap/repository/file.txt";

    //    Tạo phương thức để ghi đối tượng  vào file với 2 tham số ( đường dẫn, và danh sách list)
    public static void OutputStream(String pathFile, List<Product> products) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pathFile);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    //    Tạo 1 phương thức đọc file  với tham số truyền vào là đường dẫn.
    public List<Product> InputStream(String pathFile) {
        List<Product> arr;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(pathFile);
            objectInputStream = new ObjectInputStream(fileInputStream);
            arr = (List<Product>) objectInputStream.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return arr;
    }
/* Triển khai phương thức add()
Luồng thực thi:
Tạo 1 list = list trong file đã ghi.
Chạy foreach để kiểm tra id có tồn tại hay không
Có return : không thì add product vào list.
Sau đó viết product vào file.
* */

    @Override
    public void addProduct(Product product) {
        List<Product> productList = displayProduct();
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
                System.out.println("id đã tồn tại");
                return;
            }
        }
        productList.add(product);
        OutputStream(FILE_PATH, productList);
    }

    /* Triển khai phương thức hiển thị
    return về kết quả đọc file.
    * */
    @Override
    public List<Product> displayProduct() {
        return InputStream(FILE_PATH);
    }

    /* Triển khai phương thức tìm kiếm( int id)
    Gọi lại list danh sách có trong file.
    chạy vòng foreach để kiểm tra í có tồn tại hay không.
    * */
    @Override
    public void searchProduct(int id) {
        List<Product> productList = displayProduct();
        boolean check = false;
        for (Product product : productList) {
            check = false;
            if (product.getId() == id) {
                System.out.println(product);
                check = true;

                break;
            }

        }
        if (!check){
            System.out.println("Không có sản phẩm ở  này");
        }
    }
}



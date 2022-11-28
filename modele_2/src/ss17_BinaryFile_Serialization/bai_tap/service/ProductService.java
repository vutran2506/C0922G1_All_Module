package ss17_BinaryFile_Serialization.bai_tap.service;


import ss17_BinaryFile_Serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    public  static  final  String FILE_PATH ="src/ss17_BinaryFile_Serialization/bai_tap/repository/file.txt";
public static  List<Product> productList = new ArrayList<>();
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
    public List<Product> InputStream(String pathFile){
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


    @Override
    public void addProduct(Product product)  {
        for (Product p: productList) {
            if (p.getId()==product.getId()){
                System.out.println("id đã tồn tại");
                return;
            }
        }
        productList.add(product);
        OutputStream(FILE_PATH,productList);
    }

    @Override
    public List<Product> displayProduct() {
        return InputStream(FILE_PATH);
    }

    @Override
    public boolean searchProduct(int id) {
        for (Product product: productList) {
            if (product.getId()==id){

                return  true;
            }
        }
        return false;
    }
}



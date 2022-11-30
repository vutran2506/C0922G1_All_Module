package ss17_BinaryFile_Serialization.bai_tap.service;

import ss17_BinaryFile_Serialization.bai_tap.model.Product;

import java.util.List;
//Tạo interFace chứa các phương thức không có phần thân.
public interface IProductService {
    public void addProduct(Product product);
    List<Product> displayProduct();
    public  void searchProduct(int id);
}

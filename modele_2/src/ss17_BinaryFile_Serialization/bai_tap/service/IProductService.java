package ss17_BinaryFile_Serialization.bai_tap.service;

import ss17_BinaryFile_Serialization.bai_tap.model.Product;

import java.util.List;

public interface IProductService {
    public void addProduct(Product product);
    List<Product> displayProduct();
    boolean searchProduct(int id);
}

package ss12_map_tree.thuc_hanh.service;

import ss12_map_tree.thuc_hanh.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void addProduct(Product product);

    boolean ediProduct(Product updateProduct);

    boolean deleteProduct(int id);
}

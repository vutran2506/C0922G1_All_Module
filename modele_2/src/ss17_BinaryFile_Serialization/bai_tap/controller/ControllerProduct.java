package ss17_BinaryFile_Serialization.bai_tap.controller;


import ss17_BinaryFile_Serialization.bai_tap.model.Product;
import ss17_BinaryFile_Serialization.bai_tap.service.ProductService;

import java.util.List;

public class ControllerProduct {
    ProductService productService = new ProductService();

    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public List<Product> displayProduct() {
        return this.productService.displayProduct();
    }
    public void searchProduct(int id){
       productService.searchProduct(id);

    }
}

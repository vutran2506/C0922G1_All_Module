package ss12_map_tree.thuc_hanh.controller;

import ss12_map_tree.thuc_hanh.model.Product;
import ss12_map_tree.thuc_hanh.service.IProductService;
import ss12_map_tree.thuc_hanh.service.imp.ProductService;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductService();
    public void addProduct(Product product){
        this.productService.addProduct(product);
    }
    public List<Product> getAll(){
        return this.productService.getAll();
    }
    public boolean editProduct(Product updateProduct){
        return this.productService.ediProduct(updateProduct);
    }
    public  boolean deleteProduct(int id){
        return this.productService.deleteProduct(id);
    }
}

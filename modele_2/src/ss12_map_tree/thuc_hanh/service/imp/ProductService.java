package ss12_map_tree.thuc_hanh.service.imp;

import ss12_map_tree.thuc_hanh.model.Product;
import ss12_map_tree.thuc_hanh.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private List<Product> products= new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        for (Product p: products) {
            if(p.getId()== product.getId()){
                return;
            }
        }
        this.products.add(product);
    }
    @Override
    public List<Product> getAll() {
        return this.products;
    }
    @Override
    public boolean ediProduct(Product updateProduct) {
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        return false ;
    }
}

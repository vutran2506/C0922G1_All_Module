package ss12_map_tree.bai_tap;

import java.util.Comparator;

public class ProductComparatorIncrease implements Comparator<Product>{


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPriceProduct() > o2.getPriceProduct()){
            return 1;
        }else if (o1.getPriceProduct() < o2.getPriceProduct()){
            return -1;
        }else {
            return 0;
        }
    }

}

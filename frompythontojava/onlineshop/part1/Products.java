package frompythontojava.onlineshop.part1;
import java.util.ArrayList;
import java.util.List;

public class Products{
    List<Product> productList;

    public Products(){
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public void removeProduct(Product product){
        this.productList.remove(product);
    }

    public List<Product> getProductList(){
        return this.productList;
    }

    public List<Product> getProductsByCategory(ProductCategory productCategory){
        
    }
}
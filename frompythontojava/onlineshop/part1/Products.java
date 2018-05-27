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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        for(Product product : this.productList){
            sb.append(counter);
            sb.append(". ");
            sb.append(product.toString());
            sb.append("\n");
            counter ++;
        }

        return sb.toString();
    }

    public ArrayList<Product> getAllProductsBy(ProductCategory productCategory){
        ArrayList<Product> sameCategoryProducts = new ArrayList<>();

        for(Product product : this.productList){
            if(product.getProductCategory().equals(productCategory)){
                sameCategoryProducts.add(product);
            }
        }

        return sameCategoryProducts;
    }
}
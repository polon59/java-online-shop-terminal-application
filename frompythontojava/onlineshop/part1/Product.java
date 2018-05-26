package frompythontojava.onlineshop.part1;
import java.lang.StringBuilder;

public class Product{
    private String name;
    private double defaultPrice;
    private ProductCategory productCategory;
    private int ID;

    public Product(String name, double defaultPrice, ProductCategory productCategory){
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
    }

    public ProductCategory getProductCategory(){
        return this.productCategory;
    }

    public String toString(){
        StringBuilder productSpecification = new StringBuilder();
        productSpecification.append(this.name);
        productSpecification.append(" - ");
        productSpecification.append(this.defaultPrice);
        productSpecification.append(" - ");
        productSpecification.append(this.productCategory.getName());
        productSpecification.append("\n");
        return productSpecification.toString();
    }
}
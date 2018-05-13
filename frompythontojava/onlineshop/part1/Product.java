package frompythontojava.onlineshop.part1;

public class Product{
    private String name;
    private float defaultPrice;
    private ProductCategory productCategory;
    private int ID;

    public Product(){

    }

    public Product(String name, float defaultPrice, ProductCategory productCategory){
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.productCategory = productCategory;
    }

    public ProductCategory getProductCategory(){
        return this.productCategory;
    }

    public String toString(){
        
    }
}
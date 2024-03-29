package frompythontojava.onlineshop.part1;

import java.time.LocalDate;

public class ProductCategory{
    String name;
    int ID;
    ProductCategoryStatus status;

    public ProductCategory(){
        this.name = "noName";
    }

    public ProductCategory(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPromoted(LocalDate expirationDate){
        status.SetPromoted(expirationDate);
    }

    public void setNonPromoted(){
        status.setNonPromoted();
    }

    public ProductCategoryStatus getStatus(){
        return this.status;
    }
}

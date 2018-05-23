// package frompythontojava.onlineshop.part1;

import java.time.LocalDate;

public class ProductCategory{
    String name;
    int ID;
    ProductCategoryStatus status;

    public ProductCategory(){

    }

    public ProductCategory(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPromoted(LocalDate expirationDate){

    }

    public void setNonPromoted(){

    }

    public ProductCategoryStatus getStatus(){
        return this.status;
    }
}

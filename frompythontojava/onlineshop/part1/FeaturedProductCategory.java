package frompythontojava.onlineshop.part1;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory{
    private Date expirationDate;
    
    public FeaturedProductCategory(String name, Date expirationDate){
        this.expirationDate = expirationDate;
        super.name = name;
    }

}
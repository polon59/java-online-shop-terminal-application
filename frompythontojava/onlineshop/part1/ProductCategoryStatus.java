//package frompythontojava.onlineshop.part1;

import java.time.LocalDate;

public class ProductCategoryStatus{
    boolean isPromoted;
    LocalDate expirationDate;

    public void SetPromoted(LocalDate expirationDate){
        this.isPromoted = true;
        this.expirationDate = expirationDate;
    }

    public void setNonPromoted(){
        this.isPromoted = false;   
    }

    public boolean getIsPromoted(){
        return this.isPromoted;
    }

    public LocalDate getExpirationDate(){
        return this.expirationDate;
    }
}
package frompythontojava.onlineshop.part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.*;

public class Basket{
    private List<Product> productList;
    private Iterator<Product> iterator;

    public Basket(){
        this.productList = new ArrayList<>();
    }

    public List<Product> getProducts(){
        return this.productList;
    }

    public Iterator<Product> getIterator(){
        return this.iterator;
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public void removeProduct(Product product){
        this.productList.remove(product);
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
}
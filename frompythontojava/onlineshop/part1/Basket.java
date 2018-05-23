// package frompythontojava.onlineshop.part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
}
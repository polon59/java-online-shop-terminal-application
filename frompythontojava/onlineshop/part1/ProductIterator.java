package frompythontojava.onlineshop.part1;

import java.util.Iterator;
import java.util.ArrayList;

public class ProductIterator implements Iterator{

    private ArrayList<Product> productList;
    private int index;

    public ProductIterator(ArrayList<Product> productList){
        this.productList = productList;
        this.index = 0;
    }

    public boolean hasNext(){
        return this.index < this.productList.size();
    }

    public Product next(){
        if(hasNext()){
            return productList.get(this.index);
        }else return null;
    }
}
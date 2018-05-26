package frompythontojava.onlineshop.part1;

import java.util.ArrayList;
import java.util.Iterator;

public class Shop{
    
    private ArrayList<Product> productList = new ArrayList<>();
    private Iterator<Product> iterator;
    
    
    public Iterator<Product> getIterator(){
        this.iterator = new ProductIterator(this.productList);
        return this.iterator;
    }


    public void addProduct(Product product){
        this.productList.add(product);
    }

    public Boolean removeProduct(Product product){
        return this.productList.remove(product);
    }

    public ArrayList<Product> getAllProducts(){
        return this.productList;
    }

    public Product getProductBy(int IDsearched){
        getIterator();
        int ID;
        while(this.iterator.hasNext()){
            Product product = this.iterator.next();
            ID = product.getID();
            if( ID == IDsearched){ return product; }
        }
        return null;
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
package frompythontojava.onlineshop.part3;
import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;
import java.util.*;

public class Application {

    private static Products products = new Products();
    private static Basket basket = new Basket();
    private static List<ProductCategory> categories = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int userOption = Integer.MAX_VALUE;
        while(userOption != 0){
            
            userOption = in.nextInt(); in.nextLine();

            switch (userOption) {
                case 1:
                    products.add(createProduct());
                    break;
            
                case 2:
                    basket.add(productsChose(0));
                    break;
                case 3:
                    System.out.println(basket.toString());
                    break;
                case 4:
                    basket.removeProduct(productsChose(1));
                    break;
                case 5:
                    productsChose(3);
                    break;
                case 6:
                    for(Product product : products.getAllProductsBy(choseProductCategory())){
                        System.out.println(product.toString());
                    }
                    break;
                case 7:
                    System.out.println("all of them all avalible");
                    break;
                case 8:
                    Order order = new Order(); 
                    PaymentProcess process = new PaymentProcess();
                    process.process(order);
                    break;
            }
        }
    }

    public static Product createProduct() {
        System.out.println("name: ");
        String name = in.nextLine();

        System.out.println("price: ");
        double price = in.nextDouble(); in.nextLine();

        return new Product(name, price, createCategory());
    }

    public static ProductCategory createCategory() {
        System.out.println("1. Normal\n2.Featured");
        int option = in.nextInt(); in.nextLine();
        if(option == 1){ 
            System.out.println("Category name: ");
            String name = in.nextLine();
            return new ProductCategory(name)
        }
    }

    public static Product productsChose(int option){
        System.out.println(products.toString());
    }

    public static ProductCategory choseProductCategory() {
        
    }
}

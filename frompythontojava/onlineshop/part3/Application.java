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
            System.out.println("1-create product , 2-add to basket, 3 - print basket, 4 - remove from basket, ");
            
            userOption = in.nextInt(); in.nextLine();

            switch (userOption) {
                case 1:
                    createNewProduct();
                    break;
            
                case 2:
                    addProductToBasket();
                    break;
                case 3:
                    displayProductsInBasket();
                    break;
                case 4:
                    displayAvailableProducts();
                    break;
                case 5:
                    removeProductFromBasket();
                    break;
                case 6:
                    displayProductsByCategory();
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

    public static void displayProductsByCategory(){
        displayAllCategories();
        System.out.println("Choose category from list.");
        int choice = in.nextInt(); in.nextLine();
        ProductCategory choosenCategory = categories.get(choice - 1);
        products.getAllProductsBy(choosenCategory);
        
    }

    public static void displayAllCategories(){
        StringBuilder categoriesNames = new StringBuilder();

        for (int i = 0; i < categories.size(); i++){
            categoriesNames.append(i);
            categoriesNames.append(". ");
            categoriesNames.append(categories.get(i).getName());
            categoriesNames.append("\n");
        }
        System.out.println(categoriesNames.toString());
    }

    public static void addProductToBasket(){
        displayAvailableProducts();
        System.out.println("which product You want to add?");
        int productIndex = in.nextInt(); in.nextLine();
        Product productToBuy = products.getProductList().get(productIndex - 1);
        basket.addProduct(productToBuy);
    }

    public static void removeProductFromBasket(){
        displayProductsInBasket();
        System.out.println("which product You want to remove?");
        int productIndex = in.nextInt(); in.nextLine();
        Product productToRemove = basket.getProducts().get(productIndex - 1);
        basket.removeProduct(productToRemove);        
    }

    public static void createNewProduct(){
        System.out.println("name: ");
        String name = in.nextLine();

        System.out.println("price: ");
        double price = in.nextDouble(); in.nextLine();

        ProductCategory productCategory = createCategory();

        Product createdProduct = new Product(name, price, createCategory());
        products.add(createProduct());
    }


    public static ProductCategory createCategory() {
        System.out.println("1. Normal\n2.Featured");
        int option = in.nextInt(); in.nextLine();
        if(option == 1){ 
            System.out.println("Category name: ");
            String name = in.nextLine();
            ProductCategory normalCategory = new ProductCategory(name);
            categories.add(normalCategory);
            return normalCategory;
        }
        else{
            System.out.println("Category name: ");
            String name = in.nextLine();
            Date expirationDate = createExpirationDate();
            ProductCategory featuredCategory = new FeaturedProductCategory(name, expirationDate);
            categories.add(featuredCategory);
            return featuredCategory;

        }
        }
    

    public static Date createExpirationDate(){
        System.out.println("YEAR:");
        int year = in.nextInt(); in.nextLine();
        System.out.println("MONTH:");
        int month = in.nextInt(); in.nextLine();
        System.out.println("DAY");
        int day = in.nextInt(); in.nextLine();
        Date expirationDate = new Date(year, month, date);
        return expirationDate;
    }

    public static void displayAvailableProducts(){
        System.out.println(products.toString());
    }

    public static void displayProductsInBasket(){
        System.out.println(basket.toString());
    }

    public static ProductCategory choseProductCategory() {
        
    }

    public static void productsChose(){

    }
}

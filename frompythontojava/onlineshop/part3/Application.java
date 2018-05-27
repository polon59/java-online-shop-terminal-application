package frompythontojava.onlineshop.part3;
import frompythontojava.onlineshop.part1.*;
import frompythontojava.onlineshop.part2.*;
import java.util.*;

public class Application {

    private  Products products;
    private  Basket basket;
    private  List<ProductCategory> categories;
    private  Scanner input;
    
    public Application(){
        products = new Products();
        basket = new Basket();
        categories = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public void LaunchMainMenu() {
        int userOption = Integer.MAX_VALUE;
        while(userOption != 0){
            System.out.println("1-create product , 2-add to basket, 3 - print basket, 4 - display all products,\n 5 - remove from basket, 6 - display products by category ");
            
            userOption = input.nextInt(); input.nextLine();

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
                case 8:
                    Order order = new Order(); 
                    PaymentProcess process = new PaymentProcess();
                    process.process(order);
                    break;
            }
        }
    }

    public void displayProductsByCategory(){
        displayAllCategories();
        System.out.println("Choose category from list.");
        int choice = input.nextInt(); input.nextLine();
        ProductCategory choosenCategory = categories.get(choice - 1);
        ArrayList<Product> productsByCategory= products.getAllProductsBy(choosenCategory);
        for (Product product : productsByCategory){
            System.out.println(product.toString());
        }

    }

    public void displayAllCategories(){
        StringBuilder categoriesNames = new StringBuilder();

        for (int i = 0; i < categories.size(); i++){
            categoriesNames.append(i);
            categoriesNames.append(". ");
            categoriesNames.append(categories.get(i).getName());
            categoriesNames.append("\n");
        }
        System.out.println(categoriesNames.toString());
    }

    public void addProductToBasket(){
        displayAvailableProducts();
        System.out.println("which product You want to add?");
        int productIndex = input.nextInt(); input.nextLine();
        Product productToBuy = products.getProductList().get(productIndex - 1);
        basket.addProduct(productToBuy);
    }

    public void removeProductFromBasket(){
        displayProductsInBasket();
        System.out.println("which product You want to remove?");
        int productIndex = input.nextInt(); input.nextLine();
        Product productToRemove = basket.getProducts().get(productIndex - 1);
        basket.removeProduct(productToRemove);        
    }

    public void createNewProduct(){
        System.out.println("name: ");
        String name = input.nextLine();

        System.out.println("price: ");
        double price = input.nextDouble(); input.nextLine();

        ProductCategory productCategory = createCategory();

        Product createdProduct = new Product(name, price, createCategory());
        products.add(createProduct());
    }


    public ProductCategory createCategory() {
        System.out.println("1. Normal\n2.Featured");
        int option = input.nextInt(); input.nextLine();
        if(option == 1){ 
            System.out.println("Category name: ");
            String name = input.nextLine();
            ProductCategory normalCategory = new ProductCategory(name);
            categories.add(normalCategory);
            return normalCategory;
        }
        else{
            System.out.println("Category name: ");
            String name = input.nextLine();
            Date expirationDate = createExpirationDate();
            ProductCategory featuredCategory = new FeaturedProductCategory(name, expirationDate);
            categories.add(featuredCategory);
            return featuredCategory;

        }
        }
    

    public Date createExpirationDate(){
        System.out.println("YEAR:");
        int year = input.nextInt(); input.nextLine();
        System.out.println("MONTH:");
        int month = input.nextInt(); input.nextLine();
        System.out.println("DAY");
        int day = input.nextInt(); input.nextLine();
        Date expirationDate = new Date(year, month, date);
        return expirationDate;
    }

    public void displayAvailableProducts(){
        System.out.println(products.toString());
    }

    public void displayProductsInBasket(){
        System.out.println(basket.toString());
    }
}

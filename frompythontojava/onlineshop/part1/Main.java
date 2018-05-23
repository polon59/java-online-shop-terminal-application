//package frompythontojava.onlineshop.part1;

public class Main {

    public static void main(String[] args) {
    // tworzenie koszyków i innych pierdół
    Products products = new Products();
    PromotionManager promotionManager = new PromotionManager();
    Basket basket = new Basket();
    ProductCategory mięso = new ProductCategory("mięso");

    // dodawanie produktów
    Product golab = new Product("gołąb", 14.7, mięso);
    Product bażant = new Product("bażant", 50.0, mięso);
    products.addProduct(golab);
    products.addProduct(bażant);
    basket.addProduct(products.getProductList().get(0));
    basket.addProduct(products.getProductList().get(0));
    String pierwyj = basket.getProducts().get(0).toString();
    System.out.println(pierwyj);
    }
}

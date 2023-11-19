package vladproduction.com.example_factory;

// Client code
public class Main {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct(ConcreteProduct1.class);
        product1.info(); // Output: This is Concrete Product 1

        Product product2 = ProductFactory.createProduct(ConcreteProduct2.class);
        product2.info(); // Output: This is Concrete Product 2
    }
}

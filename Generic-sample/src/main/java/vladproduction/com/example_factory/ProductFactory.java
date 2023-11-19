package vladproduction.com.example_factory;

// Product Factory
class ProductFactory {
    public static <T extends Product> T createProduct(Class<T> productClass) {
        try {
            return productClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

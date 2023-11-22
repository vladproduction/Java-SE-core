package vladproduction.com.Dependancy_inversion.product_example;

public class Storage {

    void addProduct(Product product) {
        product.create();
        System.out.println("added: " + product.getClass().getSimpleName());
    }
    void customiseStorage(Product product){
        product.setStore();
        System.out.println("Storage customised after added: " + product.getClass().getSimpleName());
    }
}

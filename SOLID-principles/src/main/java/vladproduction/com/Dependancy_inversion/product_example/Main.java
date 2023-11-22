package vladproduction.com.Dependancy_inversion.product_example;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        Product book = new Book();
        storage.addProduct(book);
        storage.customiseStorage(book);

        Product magazine = new Magazine();
        storage.addProduct(magazine);
        storage.customiseStorage(magazine);

        Product dvd = new DVD();
        storage.addProduct(dvd);
        storage.customiseStorage(dvd);

    }
}

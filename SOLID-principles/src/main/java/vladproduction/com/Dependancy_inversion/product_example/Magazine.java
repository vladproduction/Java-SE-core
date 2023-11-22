package vladproduction.com.Dependancy_inversion.product_example;

public class Magazine implements Product{

    @Override
    public void create() {
        System.out.println("create-Magazine");
    }

    @Override
    public void setStore() {
        System.out.println("setStore-Magazine");
    }
}

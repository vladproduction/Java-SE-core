package vladproduction.com.Dependancy_inversion.product_example;

public class Book implements Product{

    @Override
    public void create() {System.out.println("create-Book");}

    @Override
    public void setStore() {System.out.println("setStore-Book");}
}

package vladproduction.com.Dependancy_inversion.product_example;

public class DVD implements Product{

    @Override
    public void create() {System.out.println("create-DVD");}

    @Override
    public void setStore() {System.out.println("setStore-DVD");}
}

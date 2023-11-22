package Block_Initialization.ch04;

public class Building_Instrument extends Instrument{
    private String name;
    private int price;
    private String country;
    private String factoryName;

    @Override
    public void sale() {
        System.out.println("Price: "+price);
    }

    @Override
    public void countryName(String country) {

    }

    @Override
    public void manufactured(String factoryName) {

    }

    static{
        System.out.println("\t\tfor building");

    }

    public Building_Instrument(String name, int price, String country, String factoryName) {
        this.name = name;
        this.price = price;
        this.country = country;
        this.factoryName = factoryName;
        System.out.println(name);
    }

    public void countryName() {
        System.out.println("Country: "+this.country);

    }


    public void manufactured() {
        System.out.println("Produced by: "+this.factoryName);

    }



}

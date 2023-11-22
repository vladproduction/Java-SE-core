package Block_Initialization.ch04;

abstract class Instrument implements Saleable, Produced{
    static {
        System.out.println("Instrument:");
    }
    @Override
    public void sale() {

    }

    public abstract void countryName(String country);

    public abstract void manufactured(String factoryName);
}

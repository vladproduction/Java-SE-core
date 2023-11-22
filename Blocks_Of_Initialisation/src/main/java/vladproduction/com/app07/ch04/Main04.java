package Block_Initialization.ch04;

public class Main04 {
    public static void main(String[] args) {
        Instrument guitar = new Music_Instrument("guitar",100,"UKR","Leoton");
        guitar.sale();
        guitar.manufactured();
        guitar.countryName();

        Instrument screwdriver = new Building_Instrument("screwdriver",300,"UKR","Dnipro");
        screwdriver.sale();
        screwdriver.manufactured();
        screwdriver.countryName();




    }
}

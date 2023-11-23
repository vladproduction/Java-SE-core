package Reflection.app02;

public class Main_forName_access {
    public static void main(String[] args) {

        try {
            Class cl = Class.forName("Reflection.app02.Phone");
            Object phoneClassObject = cl.newInstance();
            Phone phone = (Phone)phoneClassObject;
            phone.info();
            Integer rez = phone.priceDiscount(2000);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

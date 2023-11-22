package vladproduction.com.IronMan;

public class IronManAll  extends Triathlon{
    public static void main(String[] args) {
        IronManAll ironMan = new IronManAll();
        ironMan.distance("Long Distance (226 km)",3.8,180,42.2);
        IronManAll halfIronMan = new IronManAll();
        halfIronMan.distance("Half Distance (113 km)",1.9,90,21.1);
        System.out.println("===========");

        System.out.println("example: participant1-->");
        IronRating participant1 = new IronRating();
        participant1.world("World",99);
        System.out.println();
        participant1.country("Country",199);
        System.out.println();
        participant1.local("Local",4);
        System.out.println();
        System.out.println();

        System.out.println("example: participant2-->");
        IronRating participant2 = new IronRating();
        participant2.world("World",1000);
        System.out.println();
        participant2.country("Country",1100);
        System.out.println();
        participant2.local("Local",210);
        System.out.println();
        System.out.println();
    }
}

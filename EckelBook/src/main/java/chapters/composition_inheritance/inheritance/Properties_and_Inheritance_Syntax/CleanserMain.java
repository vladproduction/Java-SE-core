package chapters.composition_inheritance.inheritance.Properties_and_Inheritance_Syntax;

public class CleanserMain {
    public static void main(String[] args) {
        Cleanser c = new Cleanser();
        c.dilute();
        c.apply();
        c.scrub();

        c.print();
    }
}

package chapters.composition_inheritance.inheritance.Properties_and_Inheritance_Syntax;

public class DetergentMain{
    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        d.print();
        System.out.println("Test base class:");
        CleanserMain.main(args);
    }
}

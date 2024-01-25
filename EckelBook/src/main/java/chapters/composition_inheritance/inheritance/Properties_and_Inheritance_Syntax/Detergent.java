package chapters.composition_inheritance.inheritance.Properties_and_Inheritance_Syntax;

public class Detergent extends Cleanser{
    @Override
    public void scrub() {
        System.out.println("Detergent.scrub()");
        super.scrub();
    }


    public void foam() {
        append("foam()");
    }
}

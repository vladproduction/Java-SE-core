package chapters.composition_inheritance.inheritance.Properties_and_Inheritance_Syntax;


public class Cleanser {

    private String s = new String("Cleanser ");
    public void append(String a){
        s += a;
    }

    public void dilute(){
        append("dilute() ");
    }
    public void apply(){
        append("apply() ");
    }
    public void scrub(){
        append("scrub()");
    }

    public void print(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
    }
}

package chapters.composition_inheritance.union_comp_and_inher;

public class PlaceSetting extends Custom{
    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }

    Spoon spoon;
    Fork fork;
    Knife knife;
    DinnerPlate dinnerPlate;
    public PlaceSetting(int i) {
        super(i+1);
        spoon = new Spoon(i+2);
        fork = new Fork(i+3);
        knife = new Knife(i+4);
        dinnerPlate = new DinnerPlate(i+5);
        System.out.println("PlaceSetting(int i)-constructor");
    }
}

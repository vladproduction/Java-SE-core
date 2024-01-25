package chapters.Initialization_of_Values.in_constructor;

public class OrderOfInitialization {
    public static void main(String[] args) {

        Card t = new Card();
        t.f(); //show finishing of constructor
    }
    static class Tag{
        public Tag(int marker) {
            System.out.println("Tag ("+marker+")");
        }
    }

    static class Card{
        Tag t1 = new Tag(1); //before constructor
        public Card() {
            //we are in constructor
            System.out.println("Card()");
            t3 = new Tag(33);  //double initialization t3
        }
        Tag t2 = new Tag(2);  //after constructor
        void f(){
            System.out.println("f()");
        }
        Tag t3 = new Tag(3); //in the end
    }
}

package chapters.constructor.key_word_this;

public class Simple_use_this {
    public static void main(String[] args) {

        Leaf x = new Leaf();
        x.increment().increment().increment().print(); //i = 3
    }
    static class Leaf{
        int i = 0;
        Leaf increment(){
            i++;
            return this;
        }
        void print() {
            System.out.println("i = " + i);
        }
    }
}

package First_Project;

public class String_Concotenation {
    public static void main(String[] args) {
        String j = "Hello! Nice to meet you, what is your name? - ";
        String jn = "My name is Jack";
        String dialog1=j+jn;
        System.out.println("Jack: "+dialog1);
        String an = "Oh, Hi Jack!- ";
        String a = "I`m Alex. How you doing?";
        String dialog2=an+a;
        System.out.println("Alex: "+dialog2);
        System.out.println();

        String w = "TEST";
        int amountOfLetters =  w.length();
        System.out.println("How many letters in this word: "+w);
        System.out.println("Letters ="+amountOfLetters);


    }
}


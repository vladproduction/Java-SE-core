package vladproduction.com.app05;

public class ImmutableExample {
    public static void main(String[] args) {
        String immutableString = "Hello";
        String modifiedString = immutableString.concat(", World!"); // creates a new string object

        System.out.println(immutableString); // Output: Hello
        System.out.println(modifiedString); // Output: Hello, World!

    }
}

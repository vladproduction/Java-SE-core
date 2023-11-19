package vladproduction.com.example_intro;

public class BoxPrinter<T>{
    private final T value; //type of arguments
    public BoxPrinter(T arg) {
        value = arg;
    } //constructor of the class

    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(10); //init
        System.out.println(value1);

        BoxPrinter<String> value2 = new BoxPrinter<>("Hello World"); //init
        System.out.println(value2);

        BoxPrinter<Double> value3 = new BoxPrinter<>(2.6);
        System.out.println(value3);
    }

    @Override
    public String toString() {
        return "["+value+"]";
    } //overridden toString()






}

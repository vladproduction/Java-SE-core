package chapters.object_in_method_arg;

public class MyClass {
    int number;
    char symbol;

    public MyClass(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    void show(){
        System.out.println("number "+number+" ;symbol "+symbol);

    }
}

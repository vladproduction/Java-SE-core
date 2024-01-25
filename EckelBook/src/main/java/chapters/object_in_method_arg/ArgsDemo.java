package chapters.object_in_method_arg;

public class ArgsDemo {

    static void makeChange(MyClass obj){
        obj.number++;
        obj.symbol++;
        String textNumber = "obj.number "+obj.number;
        String textSymbol = " ;obj.symbol "+obj.symbol;
        System.out.println(textNumber+textSymbol);
    }

    static void makeChange(int number, char symbol){
        number++;
        symbol++;
        System.out.println("number "+number+" ;symbol "+symbol);

    }

    public static void main(String[] args) {
        // Создание объекта:
        MyClass obj=new MyClass(1000,'a');
        // Значения полей объекта:
        obj.show();
        // Изменение объекта:
        makeChange(obj);
        // Значения полей объекта:
        obj.show();
        // Изменение полей объекта:
        makeChange(obj.number,obj.symbol);
        // Значения полей объекта:
        obj.show();}


}

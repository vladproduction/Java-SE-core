package chapters.object_in_method_arg;

public class MoreArgsDemo {

    static void changeRef(MyClass2 obj){
        MyClass2 tmp = new MyClass2("Local Object");
        obj = tmp;
        obj.show();
    }

    public static void main(String[] args) {
        MyClass2 obj = new MyClass2("Toasts01 Object");
        obj.show();
        //trying to change ref to the object
        changeRef(obj); //here it is
        obj.show(); //check the result:

        /*  Объект с именем "Toasts01 Object".
            Объект с именем "Local Object".
            Объект с именем "Toasts01 Object".*/
    }
}

package chapters.object_in_method_arg;

public class MyClass2 {

    String name;

    public MyClass2(String name) {
        this.name = name;
    }

    void show(){
        System.out.println("Объект с именем \""+name+"\".");
    }
}

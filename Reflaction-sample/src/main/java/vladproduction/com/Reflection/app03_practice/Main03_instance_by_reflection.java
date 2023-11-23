package Reflection.app03_practice;

public class Main03_instance_by_reflection {
    public static void main(String[] args) {
        MyClass myClass = null;

        try{
            //Class class_example = Class.forName("Reflection.app03_practice.MyClass");
            Class class_example = Class.forName(MyClass.class.getName());
            myClass = (MyClass) class_example.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(myClass);
    }
}

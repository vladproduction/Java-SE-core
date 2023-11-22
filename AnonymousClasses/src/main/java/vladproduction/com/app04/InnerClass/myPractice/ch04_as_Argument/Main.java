package Anonim_class.InnerClass.myPractice.ch04_as_Argument;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(new Messaging() {
            @Override
            public String printMessage() {
                return "Now we know";
            }
        });
    }
}

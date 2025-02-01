package com.vladproduction.stack_heap_diagram;

public class MainApp {
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.start(); //AZB
    }

    public void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.print(container.getInitial());
    }

    public void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container initial2 = new Container();
        initialHolder = initial2;
        System.out.print(initialHolder.getInitial());
        System.out.print(newInitial);
    }

}

class Container {

    private String initial = "A";

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }
}

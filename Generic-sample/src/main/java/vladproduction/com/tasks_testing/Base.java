package vladproduction.com.tasks_testing;

class Base<T> {  }
class Derived<T> {  }
class Test {
    public static void main(String []args)  {
        // Stmt#1
        Base<? extends Number> b1 = new Base<Number>();

        Derived<? extends Number> b4 = new Derived<Integer>();

        Derived<?> b6 = new Derived<Integer>();

    }
}

// Stmt#1 cases to be compiled ?:
/*
Base<? extends Number> b1 = new Base<Number>()
Base<? extends Number> b2 = new Derived<Number>()
Base<? extends Number> b3 = new Derived<Integer>()
Derived<? extends Number> b4 = new Derived<Integer>()
Base<?> b5 = new Derived<Integer>()
Derived<?> b6 = new Derived<Integer>()*/

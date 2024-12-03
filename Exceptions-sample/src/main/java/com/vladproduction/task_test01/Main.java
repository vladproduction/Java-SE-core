package com.vladproduction.task_test01;

class ExceptionOne extends Exception {}
class ExceptionTwo extends ExceptionOne {}
abstract class Abstract {
    abstract void method() throws ExceptionOne;
}
public class Main extends Abstract {
    static int a,b,c,d;
    @Override
    void method() throws ExceptionTwo {
        throw new ExceptionTwo();
    }
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.method();
            a++;
        }
        catch (ExceptionTwo ex) {
            b++;
        }
        catch (ExceptionOne ex) {
            c++;
        }
        finally {
            d=a+b+c;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
package Anonim_class.InnerClass.myPractice.ch01_Inner;

public class Main2 {

    /*
    How to access the private members of a class using inner class;
        Accessing the Private Members
    As mentioned earlier, inner classes are also used to access the private members of a class.
    Suppose, a class is having private members to access them. Write an inner class in it,
    return the private members from a method within the inner class, say, getValue(), and finally
    from another class (from which you want to access the private members) call the getValue()
    method of the inner class.

    To instantiate the inner class, initially you have to instantiate the outer class. Thereafter,
    using the object of the outer class, following is the way in which you can instantiate the
    inner class.

        Outer_Demo outer = new Outer_Demo();
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
     */
    public static void main(String[] args) {
        OuterExample2 outerExample2 = new OuterExample2();
        OuterExample2.InnerExample2 innerExample2 = outerExample2.new InnerExample2();
        int number = innerExample2.getNum();
        System.out.println(number);

    }
}

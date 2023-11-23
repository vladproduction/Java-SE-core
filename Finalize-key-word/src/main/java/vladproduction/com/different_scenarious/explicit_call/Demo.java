package vladproduction.com.different_scenarious.explicit_call;

public class Demo
{
    public static void main(String[] args) 
    {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        demo1 = demo2;
        demo1.finalize(); // Explicit call to finalize method
        System.out.println("Garbage collector is called");
        System.gc(); // Implicit call to finalize() method
    }
    
    @Override
    protected void finalize()
    {
        System.out.println("Finalize() method is called");
    }
}

package vladproduction.com.different_scenarious;

public class Demo
{
    public static void main(String[] args) 
    {
        String s1 = "Hello World!";
        s1 = null;
        System.gc();
        System.out.println("Garbage collector is called");   
    }
    
    @Override
    protected void finalize()
    {
        System.out.println("Finalize method is called.");
    }    
}

package vladproduction.com.exceptions;

public class Data
{
    public static void main(String[] args) 
    {
        Data obj = new Data();
        obj = null;
        System.gc();
        System.out.println("Running garbage collector by gc() method");    
    }
    
    @Override
    protected void finalize()
    {
        System.out.println("finalize method");
        // Divide by zero exception
        int a = 1/0;
        System.out.println("Finalize method is called");
    }    
}

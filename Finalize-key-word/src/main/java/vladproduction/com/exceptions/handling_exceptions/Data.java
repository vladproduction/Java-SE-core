package vladproduction.com.exceptions.handling_exceptions;

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
        // ArithmeticException: / by zero
        try
        {
            int a = 1/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException Occured");
        }
        
        System.out.println("Finalize method is called");
    }
}

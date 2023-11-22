package vladproduction.com;

public class Throwable_Exception {
    public static void main(String[] args) {
        try{
            int[] data = new int[10];
            System.out.println("Start!!!");
            int value = data[10];
            System.out.println("Finish!!! value="+value);

            String s = null;
            s.hashCode();
        }
        catch (Throwable ex){

            System.out.println("Class="+ex.getClass());
            String errorMessage = ex.getMessage();
            System.out.println("Throwable_Exception Message="+errorMessage);
        }
    }
}

package vladproduction.com;

public class NullPointer {
    public static void main(String[] args) {
        try{
            System.out.println("Start");
            //String text = null;
            String text = "myText";
            int hashCodeText = text.hashCode();
            System.out.println(hashCodeText);
            System.out.println(text);
            System.out.println("Finish");
        }
        catch(NullPointerException ex){
            ex.printStackTrace();
        }
    }
}

package vladproduction.com.code_blocks;

public class InnerOuterCodeBlocks {
    public static void main(String[] args) {
        int counter = 1;
        {
            int valueInt = 2 + counter++; //counter available in inner block
            System.out.println("counter = " + counter + "; valueInt = " + valueInt);
        }
    }
}

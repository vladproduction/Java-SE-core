package vladproduction.com.code_blocks;

public class IndependentCodeBlocks {
    public static void main(String[] args) {
        {
            int x = 10;
            int y = -10;
            System.out.println("(" + x + "; " + y + ")");
        }
        {
            double x = 0.1;
            double y = -0.1;
            System.out.println("(" + x + "; " + y + ")");
        }
    }
}

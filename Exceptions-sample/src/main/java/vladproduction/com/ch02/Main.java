package vladproduction.com.ch02;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/Exceptions/com/ch02/Content.txt");
        ContentReader cr = new ContentReader();

        try {
            String content = cr.readerFile(file);
            System.out.println("content: " + content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("FileNotFoundException");
            throw new RuntimeException(e);
        }


    }
}

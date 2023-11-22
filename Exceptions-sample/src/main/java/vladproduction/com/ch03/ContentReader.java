package vladproduction.com.ch03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContentReader {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/java/Exceptions/com/ch03/Content.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package vladproduction.com.ch02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main_store_load {

    public static void main(String[] args) {

        File file = new File("src/main/java/vladproduction/com/ch02/forwards_file.properties");

        Properties properties = new Properties();
        properties.put("Shevchenko","7");
        properties.put("Rebrov","11");
        properties.put("Ronaldo","10");

        //FileOutputStream
        try {
            FileOutputStream fileOutputStream = new FileOutputStream (file);
            properties.store(fileOutputStream, "they score goals");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //FileInputStream
        try {
            FileInputStream fileInputStream = new FileInputStream (file);
            properties.load(fileInputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String value1 = properties.getProperty("Shevchenko");
        System.out.println("Shevchenko = "+value1);

        String value2 = properties.getProperty("Kaka");
        System.out.println("Kaka = "+value2);

        String value3 = properties.getProperty("Player","person");
        System.out.println("Player = "+value3);
    }
}

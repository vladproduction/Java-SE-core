package vladproduction.com.ch01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main_out {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("key1","1");
        prop.setProperty("key2","2");
        prop.setProperty("key3","3");
        int propSize = prop.size();
        System.out.println(propSize);

        File file = new File("src/main/java/vladproduction/com/ch01/prop_file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        prop.store(fileOutputStream,"my comment 1");


        //-------------------------------------
        Properties players = new Properties();
        players.put("Player1","1");
        players.put("Player2","2");
        players.put("Player3","3");
        players.put("Player4","4");
        players.put("Player5","5");

        try{
            File file_players = new File("src/main/java/vladproduction/com/ch01/playersFC_file.properties");
            FileOutputStream out = new FileOutputStream(file_players);
            players.store(out,"Players FC");}
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

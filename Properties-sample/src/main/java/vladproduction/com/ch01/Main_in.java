package vladproduction.com.ch01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;



public class Main_in {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream inPut = new FileInputStream("src/main/java/vladproduction/com/ch01/prop_file.txt");
        prop.load(inPut);
        System.out.println("prop printing:");
        Set keys = prop.keySet();
        for(Object item: keys){
            String propValue = prop.getProperty(item.toString());
            System.out.println(propValue+": "+item);
        }
        int propSize = prop.size();
        System.out.println("size: "+propSize);
        String value_1 = prop.getProperty("key1");
        System.out.println(value_1);

        //-------------------------------------------------
        Properties players = new Properties();


        try{
            FileInputStream file = new FileInputStream(new File("src/main/java/vladproduction/com/ch01/playersFC_file.properties"));
            players.load(file);}
        catch (Exception e){
            throw new RuntimeException(e);}

        String Player1 = players.getProperty("Player1");
        System.out.println(Player1);

        String value = players.getProperty("Player2","9");
        System.out.println("value= "+value);
    }
}

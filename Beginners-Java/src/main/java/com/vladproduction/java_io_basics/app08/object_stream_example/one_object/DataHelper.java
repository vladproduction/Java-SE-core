package com.vladproduction.java_io_basics.app08.object_stream_example.one_object;

import java.io.*;

public class DataHelper {

    //write out to the file method:
    public static void writePlayer(File file, Player player){

        try(FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(player);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException();

        }

    }

    //read in from the file method:
    public static Player readPlayer(File file){
        try(FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis)){
            return (Player) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}

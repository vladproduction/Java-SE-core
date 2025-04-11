package com.vladproduction.java_io_basics.app08.object_stream_example.list_objects;

import java.io.*;

public class DataHelper {

    //write
    public static void writeData(File file, Autosalon autosalon){

        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(autosalon);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException();
        }

    }


    //read
    public static Autosalon readData(File file){

        try(FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis)){
            return (Autosalon)ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }


}

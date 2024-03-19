package com.vladproduction.vp47_serialization_transient.try_with_resources;

import java.io.*;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Write_Read_Vehicle {
    public static void main(String[] args) {

        /**public abstract class OutputStream implements Closeable, Flushable -->
         * public interface Closeable extends AutoCloseable -->
         * void close() throws Exception;
         * thread is AutoCloseable if we use modern technic:
         *      try( with resources ){...} catch(Exception e){...}*/

        writeVehicle();
        readVehicle();

    }

    private static void readVehicle() {
        try(FileInputStream fis = new FileInputStream("vehicle.bin");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Vehicle vehicle = (Vehicle) ois.readObject();
            System.out.println(vehicle);
        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    private static void writeVehicle() {
        try(FileOutputStream fos = new FileOutputStream("vehicle.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            Vehicle vehicle = new Vehicle(1, "Toyota", 50000.0);
            oos.writeObject(vehicle);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

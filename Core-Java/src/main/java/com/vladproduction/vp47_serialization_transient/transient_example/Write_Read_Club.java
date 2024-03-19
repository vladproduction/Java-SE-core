package com.vladproduction.vp47_serialization_transient.transient_example;

import java.io.*;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Write_Read_Club {
    public static void main(String[] args) {

        /**transient makes null for fields it stands for;
         * for example we have field 'id' as transient;
         * 0 : Inter; squad = 24;
         * (for Primitive numeric types it defines as '0';
         * boolean becomes false;
         * reference types become null)*/

        writeClubData();
        readClubData();
        
    }

    private static void readClubData() {
        try{
            FileInputStream fis = new FileInputStream("clubs.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Club club = (Club) ois.readObject();
            System.out.println(club);
            ois.close();
        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    private static void writeClubData() {
        try{
            FileOutputStream fos = new FileOutputStream("clubs.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Club club = new Club(1, "Inter", 24);
            oos.writeObject(club);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

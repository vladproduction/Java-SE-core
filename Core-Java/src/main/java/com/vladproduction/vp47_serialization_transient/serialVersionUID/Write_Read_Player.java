package com.vladproduction.vp47_serialization_transient.serialVersionUID;

import com.vladproduction.vp47_serialization_transient.transient_example.Club;

import java.io.*;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Write_Read_Player {
    public static void main(String[] args) {

        writePlayer();
        readPlayer();

    }

    private static void readPlayer() {
        try{
            FileInputStream fis = new FileInputStream("player.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Player player = (Player) ois.readObject();
            System.out.println(player);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writePlayer() {
        try{
            FileOutputStream fos = new FileOutputStream("player.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Player player = new Player(1, "Recoba", Team.INTER, 20);
            oos.writeObject(player);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }


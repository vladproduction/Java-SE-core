package com.vladproduction.java_io_basics.app07.data_stream_example;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {

        String filePath = "src/main/java/com/vladproduction/java_io_basics/app07/data_stream_example/DataStreamExample.txt";
        File file = new File(filePath);

        int integerContent = 1000;
        String stringContent = "String line";

        //write - output stream
        //DataOutputStream is like the exit of the pipeline where data flows out.
        //Think of "Output" as "Outgoing" data. You use DataOutputStream to write (send out) data.
        writeData(file, integerContent, stringContent);

        //read - input stream
        //DataInputStream is like the entrance of the pipeline where data flows in.
        //Think of "Input" as "Incoming" data. You use DataInputStream to read (receive) data.
        readData(file);


    }

    private static void writeData(File file, int integerContent, String stringContent) {
        // Writing data using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(integerContent);
            dos.writeUTF(stringContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readData(File file) {
        // Reading data using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int number = dis.readInt();
            String text = dis.readUTF();
            System.out.println("Number: " + number);
            System.out.println("Text: " + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.vladproduction.java_io_basics.app08.object_stream_example.one_object;

import java.io.File;
import java.util.List;

public class Main {

    private static final String pathFile = "src/main/java/com/vladproduction/java_io_basics/app08/object_stream_example/one_object/player1.txt";
    private static final File file = new File(pathFile);

    public static void main(String[] args) {

        //generate data
        List<Player> players = DataGenerator.generateData();

        //provide write method usage:
        DataHelper.writePlayer(file, players.get(0));// attempting to write the very first object

        //provide read method usage:
        Player player = DataHelper.readPlayer(file); // attempting to read content from the file
        //print read object into console:
        System.out.println(player);

    }
}

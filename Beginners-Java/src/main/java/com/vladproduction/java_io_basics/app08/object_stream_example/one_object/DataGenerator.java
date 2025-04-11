package com.vladproduction.java_io_basics.app08.object_stream_example.one_object;

import java.util.ArrayList;
import java.util.List;

import static com.vladproduction.java_io_basics.app08.object_stream_example.one_object.PitchPosition.*;

public class DataGenerator {

    public static List<Player> generateData(){

        List<Player> data = new ArrayList<>();
        //long id, String name, int age, String team, String nationality, PitchPosition pitchPosition
        Player player1 = new Player(1, "Player1", 20, "Team1", "Nationality1", GK);
        Player player2 = new Player(2, "Player2", 21, "Team2", "Nationality2", DEF);
        Player player3 = new Player(3, "Player3", 22, "Team3", "Nationality3", MF);
        Player player4 = new Player(4, "Player4", 23, "Team4", "Nationality4", ST);
        Player player5 = new Player(5, "Player5", 24, "Team5", "Nationality5", ST);

        data.add(player1);
        data.add(player2);
        data.add(player3);
        data.add(player4);
        data.add(player5);

        return data;
    }

}

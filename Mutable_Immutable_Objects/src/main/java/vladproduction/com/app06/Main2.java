package Immutable;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> listOfTeams = new ArrayList();
        listOfTeams.add("MU");
        listOfTeams.add("Dynamo");
        Player player = new Player("Vasyl",41,listOfTeams);
        System.out.println(player);
        player.getTeams().add("Niva"); //that was before changing getter for list in class Player
        System.out.println(player);
        System.out.println("-------------------------");
        listOfTeams.add("PSV");  //that was before changing entering list in constructor for list in class Player
        System.out.println(player);
    }
}

package Immutable;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final int age;

    private final List<String> teams;

    public Player(String name, int age, List<String> listOfTeams) {
        this.name = name;
        this.age = age;
        //this.teams = teams;
        this.teams = new ArrayList<>();
        teams.addAll(listOfTeams);
    }

    public List<String> getTeams() {
        List<String> teamsList = new ArrayList<>();
        teamsList.addAll(teams);
        return teamsList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teams=" + teams +
                '}';
    }
}

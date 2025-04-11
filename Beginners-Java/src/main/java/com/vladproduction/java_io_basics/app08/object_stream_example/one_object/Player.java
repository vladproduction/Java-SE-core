package com.vladproduction.java_io_basics.app08.object_stream_example.one_object;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

    private long id;
    private String name;
    private int age;
    private String team;
    private String nationality;
    private PitchPosition pitchPosition;

    public Player(long id, String name, int age, String team, String nationality, PitchPosition pitchPosition) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.team = team;
        this.nationality = nationality;
        this.pitchPosition = pitchPosition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public PitchPosition getPitchPosition() {
        return pitchPosition;
    }

    public void setPitchPosition(PitchPosition pitchPosition) {
        this.pitchPosition = pitchPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && age == player.age && Objects.equals(name, player.name) && Objects.equals(team, player.team) && Objects.equals(nationality, player.nationality) && pitchPosition == player.pitchPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, team, nationality, pitchPosition);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                ", nationality='" + nationality + '\'' +
                ", pitchPosition=" + pitchPosition +
                '}';
    }
}

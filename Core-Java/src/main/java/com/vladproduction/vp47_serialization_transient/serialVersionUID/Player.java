package com.vladproduction.vp47_serialization_transient.serialVersionUID;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Player implements Serializable {


    @Serial
    private static final long serialVersionUID = 3321655964337392279L;
    private long id;
    private String name;
    private Team team;
    private int number;


    public Player(long id, String name, Team team, int number) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team=" + team +
                ", number=" + number +
                '}';
    }
}

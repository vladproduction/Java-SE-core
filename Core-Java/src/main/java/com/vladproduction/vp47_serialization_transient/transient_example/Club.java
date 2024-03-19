package com.vladproduction.vp47_serialization_transient.transient_example;

import java.beans.Transient;
import java.io.Serializable;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Club implements Serializable {

    private transient int id;
    private String name;
    private int squadAmount;

    public Club(int id, String name, int squadAmount) {
        this.id = id;
        this.name = name;
        this.squadAmount = squadAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSquadAmount() {
        return squadAmount;
    }

    @Override
    public String toString() {
        return id +
                " : " + name +
                "; squad = " + squadAmount;
    }
}

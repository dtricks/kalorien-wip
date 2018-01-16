package com.fhdw.wip.wip.model;

/**
 * Created by denis on 15.10.17.
 */

public class Unit {
    private String abbreviation;
    private String name;

    public Unit(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public void toJSON(){/*TODO*/}

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }
}

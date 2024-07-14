package com.durutiryaki.week5.homework4;

import java.util.ArrayList;

public class Team {
    private int id;

    private String name;

    private String description;

    private ArrayList<Rider> riders;

    public Team() {
        riders = new ArrayList<>();
    }

    public Team(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        riders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Rider> getRiders() {
        return riders;
    }

    public void setRiders(ArrayList<Rider> riders) {
        this.riders = riders;
    }
}

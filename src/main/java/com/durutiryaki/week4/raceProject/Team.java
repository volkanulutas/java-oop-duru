package com.durutiryaki.week4.raceProject;

public class Team {
    private int id;
    private String name;
    private String description;
    private String[] listOfRiders;

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

    public String[] getListOfRiders() {
        return listOfRiders;
    }

    public void setListOfRiders(String[] listOfRiders) {
        this.listOfRiders = listOfRiders;
    }
}

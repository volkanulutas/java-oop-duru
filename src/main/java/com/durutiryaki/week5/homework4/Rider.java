package com.durutiryaki.week5.homework4;

public class Rider {
    private int id; // 1

    private String name; // Jonas Vingegaard

    private int teamId; // 1

    private int yearOfBirth; // 1995

    public Rider(int id, String name, int teamId, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.teamId = teamId;
        this.yearOfBirth = yearOfBirth;
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

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}

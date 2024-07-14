package com.durutiryaki.week5.lesson2_interface;

public interface Formula1Portal {
    int createRace(String name, String description);

    int crateTeam(String name, String description);

    int createRider(int teamId, String name, int yearOfBirth);

    void viewRaceDetails(int raceId);
}

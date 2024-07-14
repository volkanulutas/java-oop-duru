package com.durutiryaki.week5.homework4;

import java.util.ArrayList;

public class CyclingPortal {
    // attributes
    private ArrayList<Race> raceList = new ArrayList<>(); // TODO: contructor da ilklendir

    private ArrayList<Team> teamList = new ArrayList<>();

    private ArrayList<Rider> riderList = new ArrayList<>();

    private int raceIdCounter = 1;

    private int teamIdCounter = 1;

    private int riderIdCounter = 1;
    // constructor
    // getter, setter

    // attributes
    public int createRace(String name, String description) {
        Race race = new Race(raceIdCounter, name, description);
        raceList.add(race);
        raceIdCounter = raceIdCounter + 1;
        return race.getId();
    }

    public int createTeam(String name, String description) {
        Team team = new Team(teamIdCounter, name, description);
        teamList.add(team);
        teamIdCounter = teamIdCounter + 1;
        return team.getId();
    }

    public int createRider(int teamId, String name, int yearOfBirth) {
        Rider rider = new Rider(riderIdCounter, name, teamId, yearOfBirth);
        riderList.add(rider);
        riderIdCounter = riderIdCounter + 1;
        return rider.getId();
    }

    public void viewRaceDetails(int raceId) {
        System.out.println("YARIŞ DETAYLARI");

        System.out.println("------");
        for (Race race : raceList) {
            if (raceId == race.getId()) {
                System.out.println("Yarış Id: " + race.getId() + " Yarış Adı: " + race.getName() + " Yarış Açıklaması: " + race.getDescription());
            }
        }
        if (raceList.size() == 0) {
            System.out.println("Hiç yarış oluşturulmadı.");
        }
        System.out.println("------");
    }
}

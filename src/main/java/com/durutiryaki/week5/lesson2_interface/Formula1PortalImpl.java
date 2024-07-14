package com.durutiryaki.week5.lesson2_interface;

import com.durutiryaki.week5.homework4.Race;
import com.durutiryaki.week5.homework4.Rider;
import com.durutiryaki.week5.homework4.Team;

import java.util.ArrayList;

public class Formula1PortalImpl implements Formula1Portal{
    // attributes
    private ArrayList<Race> raceList = new ArrayList<>(); // TODO: contructor da ilklendir

    private ArrayList<Team> teamList = new ArrayList<>();

    private ArrayList<Rider> riderList = new ArrayList<>();

    private int raceIdCounter = 1;

    private int teamIdCounter = 1;

    private int riderIdCounter = 1;

    @Override
    public int createRace(String name, String description) {
        Race race = new Race(raceIdCounter, name, description);
        raceList.add(race);
        raceIdCounter = raceIdCounter + 1;
        return race.getId();
    }

    @Override
    public int crateTeam(String name, String description) {
        Team team = new Team(teamIdCounter, name, description);
        teamList.add(team);
        teamIdCounter = teamIdCounter + 1;
        return team.getId();
    }

    @Override
    public int createRider(int teamId, String name, int yearOfBirth) {
        Rider rider = new Rider(riderIdCounter, name, teamId, yearOfBirth);
        riderList.add(rider);
        riderIdCounter = riderIdCounter + 1;
        return rider.getId();
    }

    @Override
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
        System.out.println("Takımlar: ");
        for(Team team : teamList) {
            System.out.println("İsim: " + team.getName() + " ID: " + team.getId() + " Description: " + team.getDescription() );
        }
        System.out.println("Riders: ");
        for ( Rider rider: riderList) {
            System.out.println("İsim: " + rider.getName() + " ID: " + rider.getId() + " Doğum  Yılı: " + rider.getYearOfBirth());
        }
    }
}

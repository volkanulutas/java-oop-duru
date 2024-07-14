package com.durutiryaki.week5.homework4;

public class Main {
    public static void main(String[] args) {
        // bisiklet, motor yarışları, araba yarışları
        CyclingPortal portal = new CyclingPortal();
        int raceId = portal.createRace("Tour De France 2014", "Tour De France 2014");
        System.out.println("Race Id: " + raceId);
        int teamId = portal.createTeam("HelloTurkey", "Hello turkey cycling team.");
        System.out.println("Team Id: " + teamId);
        int riderId1 = portal.createRider(teamId, "Kenan Sofuoğlu", 1990);
        int riderId2 = portal.createRider(teamId, "Duru Tiryaki", 2004);
        int riderId3 = portal.createRider(teamId, "Volkan Ulutaş", 1989);
        System.out.println(riderId1);
        System.out.println(riderId2);
        System.out.println(riderId3);
        portal.viewRaceDetails(raceId);
    }
}

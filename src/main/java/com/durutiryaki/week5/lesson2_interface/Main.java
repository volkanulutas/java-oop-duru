package com.durutiryaki.week5.lesson2_interface;

public class Main {
    public static void main(String[] args) {
        Formula1PortalImpl formula1Portal = new Formula1PortalImpl();
        int raceId = formula1Portal.createRace("Formula 1", "Formula 1 Desciption");
        int teamId = formula1Portal.crateTeam("Mercedes", "Mercedes Description");
        int riderId = formula1Portal.createRider(teamId, "Duru", 2004);
        int riderId2 = formula1Portal.createRider(teamId, "Volkan", 1989);
        formula1Portal.viewRaceDetails(raceId);

    }

}

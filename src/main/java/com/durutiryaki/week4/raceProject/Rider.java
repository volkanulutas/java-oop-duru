package com.durutiryaki.week4.raceProject;

import java.util.Scanner;

public class Rider {
    private int id;
    private int teamId;
    private String name;
    private int yearOfBirth;

    public Rider() {
    }

    public Rider(int id, int teamId, String name, int yearOfBirth) {
        this.id = id;
        this.teamId = teamId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void createRider() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the rider's id: ");
            this.id = scanner.nextInt();
            System.out.print("Please enter the rider's team id: ");
            this.teamId = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline
            System.out.print("Please enter the rider's name: ");
            this.name = scanner.nextLine();
            System.out.print("Please enter the rider's year of birth: ");
            this.yearOfBirth = scanner.nextInt();;

    }
}

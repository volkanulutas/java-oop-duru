package com.durutiryaki.week5.homework4;

public class Race {
    // attributes
    private int id; // 1

    private String name; // Tour de France

    private String description; // contains 4 mountaions, 1 sprint stage.
    // constructors

    public Race(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    // getter, setter

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
    // functionality.
}

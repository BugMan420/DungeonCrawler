package com.Izzy.DungeonCrawl;

public class Room {
    private final String description;

    public String getDescription() {
        return description;
    }

    public boolean isTreasure() {
        return isTreasure;
    }
    private final boolean isTreasure;

    private Room (String description, boolean isTreasure){
        this.description = description;
        this.isTreasure = isTreasure;
    }

    public static Room newRoom(){
        String description = null;
        boolean isTreasure = false;
        int roomType = 1;
        switch (roomType){
            case 1:
                description = "A dimly lit room with four doors";
                isTreasure = false;
                break;
            case 2:
                description = "A room with nothing of note in it";
                isTreasure = false;
            case 3:
                description = "A room with a whole load of treasure";
                isTreasure = true;
                break;
        }
        return new Room(newRoom().getDescription(), newRoom().isTreasure);
    }

}

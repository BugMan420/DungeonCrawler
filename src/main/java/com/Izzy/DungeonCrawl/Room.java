package com.Izzy.DungeonCrawl;

public class Room {
    private String description;

    public String getDescription() {
        return description;
    }

    public String getRoomName() {
        return roomName;
    }

    private String roomName;

    public Room (String name, String desc){
        this.description = desc;
        this.roomName = name;
        System.out.println(description);
    }

    static Room startingRoom = new Room("Starting Room","A dimly lit room with 4 doors in each direction.");
    static Room emptyRoom = new Room ("Empty Room", "A room with nothing remarkable.");
    static Room treasureRoom = new Room ("Treasure Room", "A room with the treasure in it.");
}

package com.Izzy.DungeonCrawl;

import java.util.Random;

public class Room {
    private static String description;

    public static String getDescription() {
        return description;
    }

    public static boolean isTreasure() {
        return isTreasure;
    }
    private static boolean isTreasure;

    private Room (String description, boolean isTreasure){
        this.description = description;
        this.isTreasure = isTreasure;
    }

    public static Room newRoom(int i){
        boolean isTreasure=false;
        Random roomRand = new Random();
        int roomType;
        int upperBound = 4;
            switch (i){
            case 1:
                description = "A dimly lit room with four doors";
                getDescription();
                break;
            case 2:
                description= "A room with nothing of note in it";
                getDescription();
                break;
            case 3:
                description = "A room that smells funky";
                getDescription();
                break;}
        return null;
    }

    public static Room treasureRoom(){
        String description = "A room with treasure in it. Congratulations!";
        boolean isTreasure = true;
        return null;
    }

}

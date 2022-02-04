package com.Izzy.DungeonCrawl;

public class Player {
    public static int currentXCo = 0;
    public static int currentYCo = 0;
    public static String name = "TestDummy";


    public static int getCurrentXCo() {
        return currentXCo;
    }

    public static int getCurrentYCo() {
        return currentYCo;
    }

    public static String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void moveNorth(){
        Player.currentYCo = currentYCo +1;
        if (Player.currentYCo > 3){
            Player.currentYCo = 0;
        }
    }

    public static void moveSouth(){
        Player.currentYCo = currentYCo -1;
        if (Player.currentYCo < 0){
            Player.currentYCo = 3;
        }
    }

    public static void moveEast(){
        Player.currentXCo = currentXCo +1;
        if (Player.currentXCo > 3){
            Player.currentXCo = 0;
        }
    }

    public static void moveWest(){
        Player.currentXCo = currentXCo -1;
        if (Player.currentXCo < 0){
            Player.currentXCo = 3;
        }
    }
}

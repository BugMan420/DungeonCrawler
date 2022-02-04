package com.Izzy.DungeonCrawl;

import java.util.Scanner;

public class Map {
    Room NewWorld[][] = new Room [4][4];
    Scanner inputRead = new Scanner(System.in);

    public void NewWorld(){
        for(int i=0; i<NewWorld.length;i++){
            for(int j=0; j<NewWorld.length;j++){
                NewWorld[i][j]=Room.emptyRoom;
            }
            NewWorld[0][0] = Room.startingRoom;
            NewWorld[3][3] = Room.treasureRoom;
        }
        System.out.println("Which Direction would you like to go?");
        switch(inputRead.next()){
            case "north":
                Player.moveNorth();
                break;
            case "south":
                Player.moveSouth();
                break;
            case "east":
                Player.moveEast();
                break;
            case "west":
                Player.moveWest();
                break;
            default:
                System.out.println("Please choose from north, east, south or west. Which direction would you like to go?");
        }

    }
}

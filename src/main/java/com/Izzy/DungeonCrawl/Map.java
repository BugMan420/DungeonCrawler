package com.Izzy.DungeonCrawl;

import java.util.Scanner;

public class Map<Coordinates> {
    Room NewWorld[][] = new Room [4][4];
    Scanner inputRead = new Scanner(System.in);
    int xPos;
    int yPos;
    Player newPlayer;
    public Player getPlayer(){
        Player.getCurrentXCo();
        Player.getCurrentYCo();
        return newPlayer;
    };

    public Room setCo (int xAxis, int yAxis){
        this.xPos = xAxis;
        this.yPos = yAxis;
        return NewWorld[xPos][yPos];
    }

    public void NewWorld(){
        for(int i=0; i<NewWorld.length;i++){
            for(int j=0; j<NewWorld.length;j++){
                NewWorld[i][j] = Room.newRoom();
            }
        }
        getPlayer();
        setCo(0,0);
        do
        {
            System.out.println("Which Direction would you like to go?");
            switch (inputRead.next()) {
                case "north":
                    Player.moveNorth();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    setCo(xPos,yPos);
                    break;
                case "south":
                    Player.moveSouth();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    setCo(xPos,yPos);
                    break;
                case "east":
                    Player.moveEast();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    setCo(xPos,yPos);
                    break;
                case "west":
                    Player.moveWest();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    setCo(xPos,yPos);
                    break;
                default:
                    System.out.println("Please choose from north, east, south or west.");
            }
        } while (Room.newRoom().isTreasure() == false);
        System.out.print("You have found the treasure");
    }
}

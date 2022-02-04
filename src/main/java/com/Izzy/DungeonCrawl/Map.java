package com.Izzy.DungeonCrawl;

import java.util.Random;
import java.util.Scanner;

public class Map<Coordinates> {
    Room NewWorld[][] = new Room [4][4];
    Scanner inputRead = new Scanner(System.in);
    int xPos, yPos;
    int randUpper = 4;
    Random treasureRand = new Random();
    int roomGenerator;


    Player newPlayer;
    public Player getPlayer(){
        return newPlayer;
    }

    public Room setCo (int xAxis, int yAxis){
        this.xPos = xAxis;
        this.yPos = yAxis;
        return NewWorld[xPos][yPos];
    }

    public void NewWorld(){
        for(int i=0; i<NewWorld.length;i++){
            for(int j=0; j<NewWorld.length;j++){
                NewWorld[i][j] = Room.newRoom(roomGenerator);
                roomGenerator = treasureRand.nextInt(randUpper);
            }
            NewWorld[treasureRand.nextInt(randUpper)][treasureRand.nextInt(randUpper)] = Room.treasureRoom();
        }
        setCo(0,0);
        System.out.println(xPos+" " +yPos);
        System.out.println("You wake up in a dungeon");
        System.out.println("Your name is " + Player.getName());
        do
        {
            System.out.println("Which Direction would you like to go?");
            switch (inputRead.next()) {
                case "north":
                    Player.moveNorth();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    System.out.println(Room.getDescription());
                    break;
                case "south":
                    Player.moveSouth();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    setCo(xPos,yPos);
                    System.out.println(Room.getDescription());
                    break;
                case "east":
                    Player.moveEast();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    setCo(xPos,yPos);
                    System.out.println(Room.getDescription());
                    break;
                case "west":
                    Player.moveWest();
                    getPlayer();
                    xPos = Player.getCurrentXCo();
                    yPos = Player.getCurrentYCo();
                    setCo(xPos,yPos);
                    System.out.println(Room.getDescription());
                    break;
                default:
                    System.out.println("Please choose from north, east, south or west.");
            }
        } while (NewWorld[xPos][yPos].isTreasure() == false);
        System.out.print("You have found the treasure");
    }
}

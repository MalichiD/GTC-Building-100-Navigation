package com.example.building100navigator;

//Destination Class is an extension of the Node class and represents any point on the map that will be targeted as a to-from point.
//This class adds the parentHall, closestNode, and hallSide variables to give more information about where the room/area resides.


public class Destination extends Node{
    private String destinationName;

    private final int destinationNumber;
    private final Hall parentHall;
    private final Node closestNode;
    private final char hallSide;



    public Destination(String name, int number, Hall parentHall, Node closestNode, char hallSide) {
        super(name);
        this.destinationNumber = number;
        this.closestNode = closestNode;
        this.parentHall = parentHall;
        this.hallSide = hallSide;
    }
    public Destination(int number, Hall parentHall, Node closestNode, char hallSide) {
        super("Room " + number);
        this.destinationName = "Room " + number;
        this.destinationNumber = number;
        this.closestNode = closestNode;
        this.parentHall = parentHall;
        this.hallSide = hallSide;
    }

    public Destination(int number, Hall parentHall, Node closestNode) {
        super("Room " + number);
        this.destinationNumber = number;
        this.closestNode = closestNode;
        this.parentHall = parentHall;

        if(number % 2 != 0){
            this.hallSide = 'A';
        } else {
            this.hallSide = 'B';
        }

    }

    public Node getClosestNode() {
        return closestNode;
    }

    public Hall getParentHall() {
        return parentHall;
    }

    public char getHallSide() {
        return hallSide;
    }
}

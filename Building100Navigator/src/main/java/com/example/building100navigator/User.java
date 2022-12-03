package com.example.building100navigator;
//The User Class contains information about the direction of the User in order to give direction cues(Turn Left, Turn Right) or to give more information about the location of a Destination (on the left, on the right)
public class User {
    private char direction;

    private char previousDirection;
    private Node currentNode;
    private Node nextNode;


    public User(){
        this.direction = '0';
        this.nextNode = null;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public void setNextNode(Node nextNode) {this.nextNode = nextNode;
    }

    public void setDirection(){
        if (nextNode.equals(currentNode.getNorthernNeighbor())){
            direction = 'N';
        } else if (nextNode.equals(currentNode.getSouthernNeighbor())) {
            direction = 'S';
        } else if (nextNode.equals(currentNode.getEasternNeighbor())){
            direction = 'E';
        } else if (nextNode.equals(currentNode.getWesternNeighbor())){
            direction = 'W';
        }
    }
    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void setPreviousDirection(char previousDirection) {
        this.previousDirection = previousDirection;
    }

    public char getDirection() {
        return direction;
    }

    public char getPreviousDirection() {
        return previousDirection;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void printDirectionChange(){
        if((previousDirection == 'N' && direction == 'E') || (previousDirection == 'E' && direction == 'S') || (previousDirection == 'S' && direction == 'W') || (previousDirection == 'W' && direction == 'N')) {

            System.out.println("Turn right, ");

        } else if ((previousDirection == 'N' && direction == 'W') || (previousDirection == 'W' && direction == 'S') || (previousDirection == 'S' && direction == 'E') || (previousDirection == 'E' && direction == 'N')) {

            System.out.println("Turn left, ");

        } else if (previousDirection == direction){

            System.out.println("Continue straight, ");

        }
    }
    public String directionChangeToString(){
        String output;
        if((previousDirection == 'N' && direction == 'E') || (previousDirection == 'E' && direction == 'S') || (previousDirection == 'S' && direction == 'W') || (previousDirection == 'W' && direction == 'N')) {

            output = "Turn right, ";

        } else if ((previousDirection == 'N' && direction == 'W') || (previousDirection == 'W' && direction == 'S') || (previousDirection == 'S' && direction == 'E') || (previousDirection == 'E' && direction == 'N')) {

            output = "Turn left, ";

        } else if (previousDirection == direction){

            output = "Continue straight, ";
        } else {
            output = "ERROR: Invalid Direction";
        }
        return output;
    }


    public void printRoomDirection(Destination room){
        if (room.getHallSide() == 'A'){
            if (direction == 'N' || direction == 'E'){
                System.out.println("Your destination will be on the left.");
            } else if (direction == 'S' || direction == 'W') {
                System.out.println("Your destination will be on the right.");
            }
        } else if (room.getHallSide() == 'B'){
            if (direction == 'N' || direction == 'E'){
                System.out.println("Your destination will be on the right.");
            } else if (direction == 'S' || direction == 'W') {
                System.out.println("Your destination will be on the left.");
            }
        } else if (room.getHallSide() == 'C') {
            System.out.println("Your destination is straight ahead.");
        }

    }

    public String roomDirectionToString(Destination room){
        String output = "";
        if (room.getHallSide() == 'A'){
            if (direction == 'N' || direction == 'E'){
                output = "Your destination will be on the left.";
            } else if (direction == 'S' || direction == 'W') {
                output = "Your destination will be on the right.";
            }
        } else if (room.getHallSide() == 'B'){
            if (direction == 'N' || direction == 'E'){
                output = "Your destination will be on the right.";
            } else if (direction == 'S' || direction == 'W') {
                output = "Your destination will be on the left.";
            }
        } else if (room.getHallSide() == 'C') {
            output = "Your destination is straight ahead.";
        }
        return output;
    }


}

public class Destination extends Node{
    private String destinationName;

    private int destinationNumber;
    private Hall parentHall;
    private Node closestNode;
    private char hallSide;



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

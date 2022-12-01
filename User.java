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


}

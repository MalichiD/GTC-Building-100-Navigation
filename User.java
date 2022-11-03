public class User {
    private char direction;
    private Node previousNode;
    private Node currentNode;


    public User(){
        this.direction = '0';
        this.currentNode = null;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public void setCurrentNode(Node currentNode) {this.currentNode = currentNode;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }


    public char getDirection() {
        return direction;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }
}

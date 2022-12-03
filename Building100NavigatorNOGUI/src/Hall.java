public class Hall {

    private int length;
    private Node nodeA;
    private Node nodeB;

    private int parentHall;

    public Hall(Node nodeA, Node nodeB, int length, int parentHall){
        this.nodeA = nodeA;
        this.nodeB = nodeB;
        this.length = length;
        this.parentHall = parentHall;
    }

    public Node getOtherNode(Node node){
        if (node.equals(nodeA)){
            return nodeB;
        } else {
            return nodeA;
        }
    }

    public int getLength() {
        return length;
    }

    public Node getNodeA() {
        return nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    public int getParentHall() {
        return parentHall;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

    public void setParentHall(int parentHall) {
        this.parentHall = parentHall;
    }
}

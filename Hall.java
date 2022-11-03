public class Hall {

    private int length;
    private Node nodeA;
    private Node nodeB;

    public Hall(Node nodeA, Node nodeB, int length){
        this.nodeA = nodeA;
        this.nodeB = nodeB;
        this.length = length;
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

    public void setLength(int length) {
        this.length = length;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

}

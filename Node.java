import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Node {
    private String name;
    private ArrayList<Hall> adjacentHalls;
    private boolean visited;
    private Node previousNode;
    private Integer distance;



    public Node(String name){
        this.name = name;
        adjacentHalls = new ArrayList<>();
    }

    public void addAdjacentHalls(Hall hall){this.adjacentHalls.add(hall);}

    public void addAdjacentHalls(Hall hall1, Hall hall2){
        this.adjacentHalls.add(hall1);
        this.adjacentHalls.add(hall2);
    }
    public void addAdjacentHalls(Hall hall1, Hall hall2, Hall hall3){
        this.adjacentHalls.add(hall1);
        this.adjacentHalls.add(hall2);
        this.adjacentHalls.add(hall3);
    }
    public void addAdjacentHalls(Hall hall1, Hall hall2, Hall hall3, Hall hall4){
        this.adjacentHalls.add(hall1);
        this.adjacentHalls.add(hall2);
        this.adjacentHalls.add(hall3);
        this.adjacentHalls.add(hall4);
    }

    public String getName() {
        return name;
    }

    public List<Hall> getAdjacentHalls() {
        return adjacentHalls;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjacentHalls(ArrayList<Hall> adjacentHalls) {
        this.adjacentHalls = adjacentHalls;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }
}

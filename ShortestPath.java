import java.util.*;
public class ShortestPath {
    public void computeShortestPaths(Node homeNode){
        homeNode.setDistance(0);


        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(homeNode);

        homeNode.setVisited(true);

        while(!priorityQueue.isEmpty()){
            Node actualNode = priorityQueue.poll();

            for (Hall hall : actualNode.getAdjacentHalls()){
                Node n = hall.getNodeB();
                if (!n.isVisited()){
                    int newDistance = actualNode.getDistance() + hall.getLength();
                    if (newDistance < n.getDistance()){
                        priorityQueue.remove(n);
                        n.setDistance(newDistance);
                        n.setPreviousNode(actualNode);
                        priorityQueue.add(n);
                    }
                }
            }
            actualNode.setVisited(true);

        }
    }
    public void computeShortestPaths(Destination homeDestination){
        Node homeNode = homeDestination.getClosestNode();
        homeNode.setDistance(0);


        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(homeNode);

        homeNode.setVisited(true);

        while(!priorityQueue.isEmpty()){
            Node actualNode = priorityQueue.poll();

            for (Hall hall : actualNode.getAdjacentHalls()){
                Node n = hall.getOtherNode(actualNode);
                if (!n.isVisited()){
                    int newDistance = actualNode.getDistance() + hall.getLength();
                    if (newDistance < n.getDistance()){
                        priorityQueue.remove(n);
                        n.setDistance(newDistance);
                        n.setPreviousNode(actualNode);
                        priorityQueue.add(n);
                    }
                }
            }
            actualNode.setVisited(true);

        }
    }

    public List<Node> getShortestPathTo(Node targetNode){
        List<Node> path = new ArrayList<>();

        for (Node node = targetNode; node != null; node = node.getPreviousNode()){
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }

    public List<Node> getShortestPathTo(Destination targetDestination){
        List<Node> path = new ArrayList<>();
        Node targetNode = targetDestination.getClosestNode();

        for (Node node = targetNode; node != null; node = node.getPreviousNode()){
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }
}

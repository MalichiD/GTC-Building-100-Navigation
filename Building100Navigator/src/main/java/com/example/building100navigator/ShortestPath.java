package com.example.building100navigator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
//The ShortestPath class uses Dijkstra's Shortest Path algorithm to find the shortest path between the HomeNode and every other Node on the map, each node is given a reference to the previous node in the path to the HomeNode,
//That reference is used to build a list, which serves as the path from point A to point B
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

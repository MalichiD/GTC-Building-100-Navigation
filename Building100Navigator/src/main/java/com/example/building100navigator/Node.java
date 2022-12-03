package com.example.building100navigator;

import java.util.ArrayList;
import java.util.List;
//The Node class is used to represent points on the map that will be traversed, each Node object contains information about the halls and nodes that are adjacent to it.
//The distance variable is used by the ShortestPath algorithm to determine the distance from the starting point to each node, and is reset on each press of the Get Directions Button
public class Node implements Comparable<Node>{
    private String name;

    private String detail;
    private ArrayList<Hall> adjacentHalls;
    private boolean visited;
    private Node previousNode;
    private Integer distance = Integer.MAX_VALUE;

    private Node northernNeighbor;
    private Node southernNeighbor;
    private Node easternNeighbor;
    private Node westernNeighbor;




    public Node(String name){
        this.name = name;
        this.detail = name;
        this.adjacentHalls = new ArrayList<>();
        this.northernNeighbor = null;
        this.southernNeighbor = null;
        this.easternNeighbor = null;
        this.westernNeighbor = null;
    }

    public Node(String name, String detail){
        this.name = name;
        this.detail = detail;
        this.adjacentHalls = new ArrayList<>();
        this.northernNeighbor = null;
        this.southernNeighbor = null;
        this.easternNeighbor = null;
        this.westernNeighbor = null;
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

    public Destination exitDestination(int number, Hall parentHall){
        Destination destination = new Destination(this.name, number, parentHall, this, 'C');
        return destination;
    }

    public Node getNorthernNeighbor() {
        return northernNeighbor;
    }

    public Node getSouthernNeighbor() {
        return southernNeighbor;
    }

    public Node getEasternNeighbor() {
        return easternNeighbor;
    }

    public Node getWesternNeighbor() {
        return westernNeighbor;
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

    public Integer getDistance() {
        return distance;
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

    public void setNeighbors(Node northernNeighbor, Node southernNeighbor, Node easternNeighbor, Node westernNeighbor){
        this.northernNeighbor = northernNeighbor;
        this.southernNeighbor = southernNeighbor;
        this.easternNeighbor = easternNeighbor;
        this.westernNeighbor = westernNeighbor;
    }

    public void setNorthernNeighbor(Node northernNeighbor) {
        this.northernNeighbor = northernNeighbor;
    }

    public void setSouthernNeighbor(Node southernNeighbor) {
        this.southernNeighbor = southernNeighbor;
    }

    public void setEasternNeighbor(Node easternNeighbor) {
        this.easternNeighbor = easternNeighbor;
    }

    public void setWesternNeighbor(Node westernNeighbor) {
        this.westernNeighbor = westernNeighbor;
    }
    public boolean isVisited() {
        return visited;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return this.detail;
    }

    @Override
    public int compareTo(Node otherNode) {
        return Integer.compare(this.distance, otherNode.getDistance());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

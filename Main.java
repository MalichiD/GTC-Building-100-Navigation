import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Node node1 = new Node("900_200");
        Node node2 = new Node("700_200");
        Node node3 = new Node("300_200");
        Node node4 = new Node("700_250");
        Node node5 = new Node("300_250");
        Node node6 = new Node("900_400");
        Node node7 = new Node("700_400");
        Node node8 = new Node("500_400");
        Node node9 = new Node("300_400");
        Node node10 = new Node("900_600");
        Node node11 = new Node("700_600");
        Node node12 = new Node("500_600");
        Node node13 = new Node("300_600");
        Node node14 = new Node("900_650");
        Node node15 = new Node("500_650");
        Node node16 = new Node("900_800");
        Node node17 = new Node("500_800");
        Node node18 = new Node("100_800");
        Node node19 = new Node("Library");

        //Entrance-Exit Nodes
        Node node20 = new Node("Main Entrance");
        Node node21 = new Node("200 Hall Exit N");
        Node node22 = new Node("200 Hall Exit S");
        Node node23 = new Node("400 Hall Exit N");
        Node node24 = new Node("800 Hall Exit N");
        Node node25 = new Node("800 Hall Exit S");
        Node node26 = new Node("700 Hall Exit W");
        Node node27 = new Node("500 Hall Exit E");

        //200 Hall
        Hall hall1 = new Hall(node1, node2, 105);
        Hall hall2 = new Hall(node2, node3, 225);
        //250 Hall
        Hall hall8 = new Hall(node4, node5,225);
        //400 Hall
        Hall hall9 = new Hall(node6, node7, 105);
        Hall hall10 = new Hall(node7, node8, 105);
        Hall hall11 = new Hall(node8, node9, 105);
        //600 Hall
        Hall hall16 = new Hall(node10, node11, 105);
        Hall hall17 = new Hall(node11, node12, 105);
        Hall hall18 = new Hall(node12, node13, 105);
        //900 Hall
        Hall hall3 = new Hall(node1, node6, 220);
        Hall hall12 = new Hall(node6, node10, 220);
        Hall hall19 = new Hall(node10, node14, 105);
        Hall hall20 = new Hall(node14, node16, 105);
        //700 Hall
        Hall hall4 = new Hall(node2, node4, 105);
        Hall hall5 = new Hall(node4, node7, 105);
        Hall hall13 = new Hall(node7, node11, 220);
        //300 Hall
        Hall hall6 = new Hall(node3, node5, 105);
        Hall hall7 = new Hall(node5, node9, 105);
        Hall hall15 = new Hall(node9, node13, 220);
        //500 Hall
        Hall hall14 = new Hall(node8, node12, 220);
        Hall hall21 = new Hall(node12, node15, 105);
        Hall hall22 = new Hall(node15, node17, 105);
        //650 Hall
        Hall hall23 = new Hall(node14, node15, 225);

        //800 Hall
        Hall hall24 = new Hall(node16, node17, 225);
        Hall hall25 = new Hall(node17, node18, 225);

        //Main Entrance Area
        Hall hall26 = new Hall(node13, node18, 230);


        node1.addAdjacentHalls(hall1, hall3);
        node2.addAdjacentHalls(hall1, hall2);
        node3.addAdjacentHalls(hall2, hall6);
        node4.addAdjacentHalls(hall4, hall5, hall8);
        node5.addAdjacentHalls(hall6, hall7, hall8);
        node6.addAdjacentHalls(hall3, hall9, hall12);
        node7.addAdjacentHalls(hall5, hall9, hall10, hall13);
        node8.addAdjacentHalls(hall10, hall11, hall14);
        node9.addAdjacentHalls(hall7, hall11, hall15);
        node10.addAdjacentHalls(hall12, hall16, hall19);
        node11.addAdjacentHalls(hall13, hall16, hall17);
        node12.addAdjacentHalls(hall14, hall17, hall18, hall21);
        node13.addAdjacentHalls(hall15, hall18, hall26);
        node14.addAdjacentHalls(hall19, hall20, hall23);
        node15.addAdjacentHalls(hall21, hall22, hall23);
        node16.addAdjacentHalls(hall20, hall24);
        node17.addAdjacentHalls(hall22, hall24, hall25);
        node18.addAdjacentHalls(hall25, hall26);
    }

}
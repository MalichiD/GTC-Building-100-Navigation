import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();

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

        Node node20 = new Node("Main Entrance");
        Node node21 = new Node("200 Hall Entrance N"); //AKA: Exit to BLDG 300
        Node node22 = new Node("200 Hall Entrance S"); //AKA:
        Node node23 = new Node("400 Hall Entrance N");
        Node node24 = new Node("800 Hall Entrance N");
        Node node25 = new Node("800 Hall Entrance S");
        Node node26 = new Node("700 Hall Entrance W"); //AKA: Exit to BLDG 200
        Node node27 = new Node("500 Hall Entrance E");
        Node node28 = new Node("600 Hall Entrance N");






        //200 Hall
        Hall hall1 = new Hall(node1, node2, 105, 200);
        Hall hall2 = new Hall(node2, node3, 225, 200);
        //250 Hall
        Hall hall8 = new Hall(node4, node5, 225, 250);
        //400 Hall
        Hall hall9 = new Hall(node6, node7, 105, 400);
        Hall hall10 = new Hall(node7, node8, 105, 400);
        Hall hall11 = new Hall(node8, node9, 105, 400);
        //600 Hall
        Hall hall16 = new Hall(node10, node11, 105, 600);
        Hall hall17 = new Hall(node11, node12, 105, 600);
        Hall hall18 = new Hall(node12, node13, 105, 600);
        //900 Hall
        Hall hall3 = new Hall(node1, node6, 220, 900);
        Hall hall12 = new Hall(node6, node10, 220, 900);
        Hall hall19 = new Hall(node10, node14, 105, 900);
        Hall hall20 = new Hall(node14, node16, 105, 900);
        //700 Hall
        Hall hall4 = new Hall(node2, node4, 105, 700);
        Hall hall5 = new Hall(node4, node7, 105, 700);
        Hall hall13 = new Hall(node7, node11, 220, 700);
        //300 Hall
        Hall hall6 = new Hall(node3, node5, 105, 300);
        Hall hall7 = new Hall(node5, node9, 105, 300);
        Hall hall15 = new Hall(node9, node13, 220, 300);
        //500 Hall
        Hall hall14 = new Hall(node8, node12, 220, 500);
        Hall hall21 = new Hall(node12, node15, 105 , 500);
        Hall hall22 = new Hall(node15, node17, 105, 500);
        //650 Hall
        Hall hall23 = new Hall(node14, node15, 225, 650);

        //800 Hall
        Hall hall24 = new Hall(node16, node17, 225, 800);
        Hall hall25 = new Hall(node17, node18, 225, 800);

        //Main Entrance Area
        Hall hall26 = new Hall(node13, node20, 230, 600);
        Hall hall27 = new Hall(node20, node18, 115, 100);

        //Other Entrance Areas
        Hall hall28 = new Hall(node21, node1, 100, 200); //200 Hall N
        Hall hall29 = new Hall(node22, node3, 50, 200); //200 Hall S
        Hall hall30 = new Hall(node23, node6, 100, 400); //400 Hall N
        Hall hall31 = new Hall(node24, node16, 100, 800); //800 Hall N
        Hall hall32 = new Hall(node25, node18, 50, 800); //800 Hall S
        Hall hall33 = new Hall(node26, node2, 25, 700); //700 Hall W
        Hall hall34 = new Hall(node27, node17, 50, 500); //500 Hall E
        Hall hall35 = new Hall(node28, node10, 50, 600); //600 Hall N

        //Entrance-Exit Nodes as Destinations
        Destination exit1 = node20.exitDestination(1, hall26);
        Destination exit2 = node21.exitDestination(2, hall28);
        Destination exit3 = node22.exitDestination(3, hall29);
        Destination exit4 = node23.exitDestination(4, hall30);
        Destination exit5 = node24.exitDestination(5, hall31);
        Destination exit6 = node25.exitDestination(6, hall32);
        Destination exit7 = node26.exitDestination(7, hall33);
        Destination exit8 = node27.exitDestination(8, hall34);
        Destination exit9 = node28.exitDestination(9, hall35);

        Destination room1 = new Destination(201, hall2, node3);
        Destination room2 = new Destination(202, hall2, node3);
        Destination room3 = new Destination(203, hall2, node3);
        Destination room4 = new Destination(204, hall2, node3);
        Destination room5 = new Destination(205, hall2, node3);
        Destination room6 = new Destination(206, hall2, node3);
        Destination room7 = new Destination(207,hall2,node3);
        Destination room8 = new Destination(208,hall2,node3);
        Destination room9 = new Destination(209,hall2,node2);
        Destination room10 = new Destination(210, hall2, node2);
        Destination room11 = new Destination(211, hall2, node2);
        Destination room12 = new Destination(213, hall1, node2);
        Destination room0 = new Destination(0, hall24, node16);


        node1.addAdjacentHalls(hall1, hall3, hall28);
        node1.setNeighbors(node21, node2, node6, null);


        node2.addAdjacentHalls(hall1, hall2, hall33);
        node2.setNeighbors(node1, node3, node4, node26);

        node3.addAdjacentHalls(hall2, hall6, hall29);
        node3.setNeighbors(node2, node22, node5, null);

        node4.addAdjacentHalls(hall4, hall5, hall8);
        node4.setNeighbors(null, node5, node7, node2);

        node5.addAdjacentHalls(hall6, hall7, hall8);
        node5.setNeighbors(node4, null, node9, node3);

        node6.addAdjacentHalls(hall3, hall9, hall12, hall30);
        node6.setNeighbors(node23, node7, node10, node1);

        node7.addAdjacentHalls(hall5, hall9, hall10, hall13);
        node7.setNeighbors(node6, node8, node11, node4);

        node8.addAdjacentHalls(hall10, hall11, hall14);
        node8.setNeighbors(node7, node9, node12, null);

        node9.addAdjacentHalls(hall7, hall11, hall15);
        node9.setNeighbors(node8, null, node13, node5);

        node10.addAdjacentHalls(hall12, hall16, hall19, hall35);
        node10.setNeighbors(node28, node11, node14, node6);

        node11.addAdjacentHalls(hall13, hall16, hall17);
        node11.setNeighbors(node10, node12, null, node7);

        node12.addAdjacentHalls(hall14, hall17, hall18, hall21);
        node12.setNeighbors(node11, node13, node15, node8);

        node13.addAdjacentHalls(hall15, hall18, hall26);
        node13.setNeighbors(node12, node20, null, node9);

        node14.addAdjacentHalls(hall19, hall20, hall23);
        node14.setNeighbors(null, node15, node16, node10);

        node15.addAdjacentHalls(hall21, hall22, hall23);
        node15.setNeighbors(node14, null, node17,node12);

        node16.addAdjacentHalls(hall20, hall24, hall31);
        node16.setNeighbors(node24, node17, null, node14);

        node17.addAdjacentHalls(hall22, hall24, hall25, hall34);
        node17.setNeighbors(node16, node18, node27, node15);

        node18.addAdjacentHalls(hall25, hall27, hall32);
        node18.setNeighbors(node17, node25, null, node20);

        node20.addAdjacentHalls(hall26, hall27);
        node20.setNeighbors(node13, null, node18, null);

        node21.addAdjacentHalls(hall28);
        node21.setNeighbors(null, node1, null, null);

        node22.addAdjacentHalls(hall29);
        node22.setNeighbors(node3, null, null, null);

        node23.addAdjacentHalls(hall30);
        node23.setNeighbors(null, node6, null, null);

        node24.addAdjacentHalls(hall31);
        node24.setNeighbors(null, node16, null, null);

        node25.addAdjacentHalls(hall32);
        node25.setNeighbors(node18, null, null, null);

        node26.addAdjacentHalls(hall33);
        node26.setNeighbors(null, null, node2, null);

        node27.addAdjacentHalls(hall34);
        node27.setNeighbors(null, null, null, node17);

        node28.addAdjacentHalls(hall35);
        node28.setNeighbors(null, node10, null, null);



        List<Destination> directory = Arrays.asList(room1, room2, room3, room4, room5, room6, room7, room8, room9, room10, room11, room12, room0, exit1, exit2, exit3, exit4, exit5, exit6, exit7, exit8, exit9);
        ShortestPath shortestPath = new ShortestPath();


        Scanner scan = new Scanner(System.in);

        System.out.println("Where are you starting: ");
        String start = scan.nextLine();

        System.out.println("Where are you going: ");
        String end = scan.nextLine();


        Destination startNode = null;
        for (Destination s : directory) {
            if (s.getName().equals(start)) {
                startNode = s;
            }
        }



        Destination endNode = null;
        for (Destination s : directory) {
            if (s.getName().equals(end)) {
                endNode = s;
            }
        }


        if (startNode == null || endNode == null){
            System.out.println("Invalid Nodes");
            return;
        }
        shortestPath.computeShortestPaths(startNode);


        System.out.println("Directions:");

        for (int i = 0; i < shortestPath.getShortestPathTo(endNode).size(); i++) {
            if (shortestPath.getShortestPathTo(endNode).size() == 1){
                System.out.println("Warning: Start Node and End Node are the same or an error has occurred");
                System.out.print(" go to ");
                System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
            } else if (i == 0) {

                user.setCurrentNode(shortestPath.getShortestPathTo(endNode).get(i));
                user.setNextNode(shortestPath.getShortestPathTo(endNode).get(i+1));
                user.setDirection();
                System.out.print("Start at ");
                System.out.println(shortestPath.getShortestPathTo(endNode).get(i));

            } else if (i == (shortestPath.getShortestPathTo(endNode).size() - 1)) {

                user.setCurrentNode(shortestPath.getShortestPathTo(endNode).get(i));

                System.out.print(" then go to ");

                System.out.println(shortestPath.getShortestPathTo(endNode).get(i));

            } else {

                user.setCurrentNode(shortestPath.getShortestPathTo(endNode).get(i));
                user.setNextNode(shortestPath.getShortestPathTo(endNode).get(i+1));
                user.setPreviousDirection(user.getDirection());
                user.setDirection();

                System.out.print(" then go to ");
                System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
                user.printDirectionChange();

            }

        }

        System.out.println("\n");
        System.out.println("=================================================================");


        System.out.println("Arrived? Or where are you: ");
        start = scan.nextLine();


        while (!start.equals("Arrived")) {


            for (Destination s : directory) {
                if (s.getName().equals(start)) {
                    startNode = s;
                }
            }


            for (Destination s : directory) {
                s.setDistance(Integer.MAX_VALUE);
                s.setVisited(false);
                s.setPreviousNode(null);
            }


            shortestPath.computeShortestPaths(startNode);


            System.out.print("To get there,");
            for (int i = 0; i < shortestPath.getShortestPathTo(endNode).size(); i++) {
                if (i == 0) {

                    System.out.print(" go to ");
                } else {
                    System.out.print(" then go to ");
                }
                System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
            }

            System.out.println("\n");


            System.out.println("=================================================================");
            System.out.println("Arrived? Or where are you: ");
            start = scan.nextLine();
        }

    }
}

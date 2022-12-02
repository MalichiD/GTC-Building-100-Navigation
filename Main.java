import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        Node node1 = new Node("900_200", "the intersection of Hall 900 and Hall 200");
        Node node2 = new Node("700_200", "the intersection of Hall 700 and Hall 200");
        Node node3 = new Node("300_200", "the intersection of Hall 300 and Hall 200");
        Node node4 = new Node("700_250", "the intersection of Hall 700 and Hall 250");
        Node node5 = new Node("300_250", "the intersection of Hall 300 and Hall 250");
        Node node6 = new Node("900_400", "the intersection of Hall 900 and Hall 400");
        Node node7 = new Node("700_400", "the intersection of Hall 700 and Hall 400");
        Node node8 = new Node("500_400", "the intersection of Hall 500 and Hall 400");
        Node node9 = new Node("300_400", "the intersection of Hall 399 and Hall 400");
        Node node10 = new Node("900_600", "the intersection of Hall 900 and Hall 600");
        Node node11 = new Node("700_600", "the intersection of Hall 700 and Hall 600");
        Node node12 = new Node("500_600", "the intersection of Hall 500 and Hall 600");
        Node node13 = new Node("300_600", "the intersection of Hall 300 and Hall 600");
        Node node14 = new Node("900_650", "the intersection of Hall 900 and Hall 650");
        Node node15 = new Node("500_650", "the intersection of Hall 500 and Hall 650");
        Node node16 = new Node("900_800", "the intersection of Hall 900 and Hall 800");
        Node node17 = new Node("500_800", "the intersection of Hall 500 and Hall 800");
        Node node18 = new Node("100_800", "the intersection of Hall 100 and Hall 800");

        Node node20 = new Node("Main Entrance");
        Node node21 = new Node("200 Hall Entrance N"); //AKA: Exit to BLDG 300
        Node node22 = new Node("200 Hall Entrance S"); //AKA:
        Node node23 = new Node("400 Hall Entrance N");
        Node node24 = new Node("800 Hall Entrance N");
        Node node25 = new Node("800 Hall Entrance S");
        Node node26 = new Node("700 Hall Entrance W"); //AKA: Exit to BLDG 200
        Node node27 = new Node("500 Hall Entrance E");
        Node node28 = new Node("600 Hall Entrance N");
        Node node29 = new Node("Library");






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

        Hall hall36 = new Hall(node29, node9, 80, 400);

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

        //100 Hall Rooms
        Destination room1 = new Destination("One Stop", 101, hall27, node20, 'A');
        Destination room2 = new Destination(102, hall27, node20);
        Destination room3 = new Destination(104, hall27, node18);
        Destination room4 = new Destination(106, hall27, node18);

        //200 Hall Rooms
        Destination room5 = new Destination(201, hall29, node3);
        Destination room6 = new Destination(202, hall29, node3);
        Destination room7 = new Destination(203, hall2, node3);
        Destination room8 = new Destination(204, hall2, node3);
        Destination room9 = new Destination(205, hall2, node3);
        Destination room10 = new Destination(206, hall2, node3);
        Destination room11 = new Destination(207,hall2,node3);
        Destination room12 = new Destination(208,hall2,node3);
        Destination room13 = new Destination(209,hall2,node2);
        Destination room14 = new Destination(210, hall2, node2);
        Destination room15 = new Destination(211, hall2, node2);
        Destination room16 = new Destination(213, hall1, node2);
        Destination room17 = new Destination(215, hall1, node1);
        Destination room18 = new Destination("Student Center", 217, hall28, node21, 'A');
        Destination room19 = new Destination("Food Court", 220, hall28, node21, 'B');

        //250 Hall Rooms
        Destination room20 = new Destination(250, hall8, node5);
        Destination room21 = new Destination(251, hall8, node5);
        Destination room22 = new Destination(253, hall8, node5);
        Destination room23 = new Destination(254, hall8, node4);
        Destination room24 = new Destination(255, hall8, node4);
        Destination room25 = new Destination(257, hall8, node4);
        Destination room26 = new Destination(259, hall8, node4);
        Destination room27 = new Destination(260, hall8, node4);
        Destination room28 = new Destination(262, hall8, node4);
        Destination room29 = new Destination(264, hall8, node4);
        Destination room30 = new Destination(265, hall8, node4);

        //300 Hall Rooms
        Destination room31 = new Destination(302, hall6, node5);
        Destination room32 = new Destination(304, hall6, node5);
        Destination room33 = new Destination(306, hall7, node5);
        Destination room34 = new Destination(307, hall7, node9);
        Destination room35 = new Destination(309, hall7, node9);
        Destination room36 = new Destination(315, hall15, node9);
        Destination room37 = new Destination(316, hall15, node9);
        Destination room38 = new Destination(318, hall15, node9);
        Destination room39 = new Destination(319, hall15, node9);
        Destination room40 = new Destination(320, hall15, node9);
        Destination room41 = new Destination(321, hall15, node13);
        Destination room42 = new Destination(322, hall15, node13);
        Destination room43 = new Destination(323, hall15, node13);

        //400 Hall Rooms
        Destination room44 = new Destination(401, hall36, node29, 'A');
        Destination room45 = new Destination("Library", 402, hall36, node29, 'A');
        Destination room46 = new Destination(403, hall36, node29, 'A');
        Destination room47 = new Destination(404, hall36, node29, 'A');
        Destination room48 = new Destination(405, hall36, node9);
        Destination room49 = new Destination(407, hall11, node9);
        Destination room50 = new Destination(409, hall11, node8);
        Destination room51 = new Destination(411, hall10, node8);
        Destination room52 = new Destination(413, hall10, node7);
        Destination room53 = new Destination(415, hall30, node23);
        Destination room54 = new Destination("GED", 416, hall30, node23, 'B');
        Destination room55 = new Destination(418, hall30, node23);

        //500 Hall Rooms
        Destination room56 = new Destination(515, hall14, node8);
        Destination room57 = new Destination(516, hall14, node8);
        Destination room58 = new Destination(517, hall14, node8);
        Destination room59 = new Destination(518, hall14, node8);
        Destination room60 = new Destination(519, hall14, node12);
        Destination room61 = new Destination(520, hall14, node12);
        Destination room62 = new Destination(521, hall14, node12);
        Destination room63 = new Destination(523, hall14, node12);
        Destination room64 = new Destination(527, hall21, node15);
        Destination room65 = new Destination(529, hall22, node15);

        //600 Hall Rooms
        Destination room66 = new Destination("Recruitment Center", 601, hall26, node13, 'A');
        Destination room67 = new Destination("Customer Care", 604, hall18, node12, 'B');
        Destination room68 = new Destination("Academic Affairs",605, hall18, node12, 'A');
        Destination room69 = new Destination("Snack Bar", 606, hall17, node12, 'B');
        Destination room70 = new Destination(607, hall17, node11);
        Destination room71 = new Destination(608, hall16, node11);
        Destination room72 = new Destination(609, hall16, node11);
        Destination room73 = new Destination(610, hall16, node11);
        Destination room74 = new Destination("Staff Lounge", 611, hall16, node10, 'A');
        Destination room75 = new Destination(612, hall16, node10);
        Destination room76 = new Destination(613, hall12, node10);
        Destination room77 = new Destination(615, hall35, node28);

        //650 Hall Rooms
        Destination room78 = new Destination(651, hall23, node15);
        Destination room79 = new Destination(654, hall23, node15);
        Destination room80 = new Destination(652, hall23, node15);
        Destination room81 = new Destination(653, hall23, node15);
        Destination room82 = new Destination(654, hall23, node15);
        Destination room83 = new Destination(655, hall23, node15);
        Destination room84 = new Destination(656, hall23, node14);
        Destination room85 = new Destination(657, hall23, node14);
        Destination room86 = new Destination(658, hall23, node14);
        Destination room87 = new Destination(659, hall23, node14);

        //700 Hall Rooms
        Destination room88 = new Destination(701, hall4, node2);
        Destination room89 = new Destination(702, hall2, node2);
        Destination room90 = new Destination(703, hall4, node4);
        Destination room91 = new Destination(705,hall5, node4);
        Destination room92 = new Destination("Lecture Hall",707, hall5, node7, 'A');
        Destination room93 = new Destination(708, hall5, node7);
        Destination room94 = new Destination(715, hall13,node7);
        Destination room95 = new Destination(716, hall13, node7);
        Destination room96 = new Destination(717, hall13, node7);
        Destination room97 = new Destination(718, hall13, node7);
        Destination room98 = new Destination(719, hall13, node7);
        Destination room99 = new Destination(720, hall13, node7);
        Destination room100 = new Destination(722, hall13, node11);
        Destination room101 = new Destination("Student Open Lab", 723, hall13, node11, 'A');

        //800 Hall Rooms
        Destination room102 = new Destination("Human Resources", 802, hall32, node25, 'B');
        Destination room103 = new Destination("Mail Room", 804, hall32, node25, 'B');
        Destination room104 = new Destination("Facilities Department", 806, hall25, node18, 'B');
        Destination room105 = new Destination(808, hall25, node18);
        Destination room106 = new Destination("Assessment Center", 809, hall25, node17,'A');
        Destination room107 = new Destination(811, hall25, node17);
        Destination room108 = new Destination(812, hall25, node17);
        Destination room109 = new Destination(813, hall25, node17);
        Destination room110 = new Destination(814, hall25, node17);
        Destination room111 = new Destination(815, hall24, node17);
        Destination room112 = new Destination(816, hall24, node17);
        Destination room113 = new Destination(818, hall24, node17);
        Destination room114 = new Destination(820, hall24, node17);
        Destination room115 = new Destination(822, hall24, node16);
        Destination room116 = new Destination(823, hall24, node16);
        Destination room117 = new Destination(824, hall24, node16);
        Destination room118 = new Destination(825, hall24, node16);
        Destination room119 = new Destination(826, hall24, node16);
        Destination room120 = new Destination(828, hall31, node24);

        //900 Hall Rooms
        Destination room121 = new Destination(902, hall3, node1);
        Destination room122 = new Destination(903, hall3, node1);
        Destination room123 = new Destination(904, hall3, node1);
        Destination room124 = new Destination(905, hall3, node1);
        Destination room125 = new Destination(906, hall3, node1);
        Destination room126 = new Destination(907, hall3, node6);
        Destination room127 = new Destination(908, hall3, node6);
        Destination room128 = new Destination("Bookstore", 909, hall3, node6, 'A');
        Destination room129 = new Destination(910, hall3, node6);
        Destination room130 = new Destination(911, hall3, node6);
        Destination room131 = new Destination(913, hall3, node6);
        Destination room132 = new Destination(914, hall3, node6);
        Destination room133 = new Destination(916, hall12, node6);
        Destination room134 = new Destination("Adult Education", 919, hall12, node10, 'A');
        Destination room135 = new Destination(920, hall12, node10);
        Destination room136 = new Destination(922, hall12, node10);
        Destination room137 = new Destination(924, hall12, node10);
        Destination room138 = new Destination(927, hall19, node14);
        Destination room139 = new Destination(929, hall19, node14);
        Destination room140 = new Destination(931, hall19, node14);
        Destination room141 = new Destination(932, hall20, node14);
        Destination room142 = new Destination(933, hall20, node16);
        Destination room143 = new Destination(935, hall20, node16);



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

        node9.addAdjacentHalls(hall7, hall11, hall15, hall36);
        node9.setNeighbors(node8, node29, node13, node5);

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

        node29.addAdjacentHalls(hall36);
        node29.setNeighbors(node9, null, null, null);



        List<Destination> directory = Arrays.asList(room1, room2, room3, room4, room5, room6, room7, room8, room9, room10, room11, room12, room13, room14, room15, room16, room17, room18, room19, room20, room21, room22, room23, room24, room25, room26, room27, room28, room29, room30, room31, room32, room33, room34, room35, room36, room37, room38, room39, room40, room41, room42, room43, room44, room45, room46, room47, room48, room49, room50, room51, room52, room53, room54, room55, room56, room57, room58, room59, room60, room61, room62, room63, room64, room65, room66, room67, room68, room69, room70, room71, room72, room73, room74, room75, room76, room77, room78, room79, room80, room81, room82, room83, room84, room85, room86, room87, room88, room89, room90, room91, room92, room93, room94, room95, room96, room97, room98, room99, room100, room101, room102, room103, room104, room105, room106, room107, room108, room109, room110, room111, room112, room113, room114, room115, room116, room117, room118, room119, room120, room121, room122, room123, room124, room125, room126, room127, room128, room129, room130, room131, room132, room133, room134, room135, room136, room137, room138, room139, room140, room141, room142, room143, exit1, exit2, exit3, exit4, exit5, exit6, exit7, exit8, exit9);
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
                //If the User needs to pass their Destination to get to the node closest to the Destination, don't print the last instruction.
                if (!(shortestPath.getShortestPathTo(endNode).get(i - 1).equals(endNode.getParentHall().getOtherNode(endNode.getClosestNode())))){
                    user.setCurrentNode(shortestPath.getShortestPathTo(endNode).get(i));

                    System.out.print(" then go to ");

                    System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
                }
                System.out.println("Your destination will be found in Hall " + endNode.getParentHall().getParentHall());
                user.printRoomDirection(endNode);

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


            System.out.println("Directions:");
            for (int i = 0; i < shortestPath.getShortestPathTo(endNode).size(); i++) {

                if (shortestPath.getShortestPathTo(endNode).size() == 1) {
                    System.out.println("Warning: Start Node and End Node are the same or an error has occurred");
                    System.out.print(" go to ");
                    System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
                } else if (i == 0) {

                    user.setCurrentNode(shortestPath.getShortestPathTo(endNode).get(i));
                    user.setNextNode(shortestPath.getShortestPathTo(endNode).get(i + 1));
                    user.setDirection();
                    System.out.print("Start at ");
                    System.out.println(shortestPath.getShortestPathTo(endNode).get(i));

                } else if (i == (shortestPath.getShortestPathTo(endNode).size() - 1)) {
                    //If the User needs to pass their Destination to get to the node closest to the Destination, don't print the last instruction.
                    if (!(shortestPath.getShortestPathTo(endNode).get(i - 1).equals(endNode.getParentHall().getOtherNode(endNode.getClosestNode())))) {
                        user.setCurrentNode(shortestPath.getShortestPathTo(endNode).get(i));

                        System.out.print(" then go to ");

                        System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
                    }

                    user.printRoomDirection(endNode);

                } else {

                    user.setCurrentNode(shortestPath.getShortestPathTo(endNode).get(i));
                    user.setNextNode(shortestPath.getShortestPathTo(endNode).get(i + 1));
                    user.setPreviousDirection(user.getDirection());
                    user.setDirection();

                    System.out.print(" then go to ");
                    System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
                    user.printDirectionChange();
                }


                System.out.println("=================================================================");
                System.out.println("Arrived? Or where are you: ");
                start = scan.nextLine();
            }
        }

    }
}

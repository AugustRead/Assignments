package Task2;

import java.util.ArrayList;

public class Main {

    static ArrayList<Room> rooms = new ArrayList<Room>();
    static int numberOfLamps;

    public static void main(String[] args) {

        Room room = new Room(4, 1, 1, 1);
        Room room1 = new Room(4, 2, 25, 2);
        Room room2 = new Room(4, 3, 50, 3);

        rooms.add(room);
        rooms.add(room1);
        rooms.add(room2);

        Building building = new Building(rooms, 1, 4, false);

        for (Room rooms : rooms) {
            numberOfLamps += rooms.getNumberOfLamps();
        }
        System.out.println("Total number of lamps is: " + numberOfLamps);

        if(building.getNumberOfFloors()> building.getRooms().size()){
            System.out.println("\nThis is an odd building");
        }
    }
}


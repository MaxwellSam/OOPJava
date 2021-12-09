package test;
import domain.DataBaseEvents;
import domain.DataBaseRooms;

public class DataBaseTest {
    public static void main(String[] args) {
        // Test Events
        DataBaseEvents events = new DataBaseEvents();
        // Test Rooms
        DataBaseRooms rooms = new DataBaseRooms();
        // Display DataBases
        System.out.println("##########DATABASE EVENTS TESTS");
        events.displayDataBase();
        System.out.println("##########DATABASE ROOMS TESTS");
        rooms.displayDataBase();
    }
}

package test;
import domain.entities.*;
import domain.agregate.*;

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

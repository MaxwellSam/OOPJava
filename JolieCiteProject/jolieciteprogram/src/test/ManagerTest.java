package test;
import domain.DataBaseEvents;
import domain.DataBaseRooms;
import domain.ManagerRooms;
import domain.entities.*;
import java.util.ArrayList;

public class ManagerTest {
    public static void main(String[] args) {
    // Load Events
    DataBaseEvents events = new DataBaseEvents();
    // Load Rooms
    DataBaseRooms rooms = new DataBaseRooms();

    ManagerRooms manager = new ManagerRooms();
    
    System.out.println("##########TEST MANAGER");
    manager.addRooms(rooms.getRooms());
    manager.displayRooms();

    ArrayList<Event> noPlacedEvent = manager.placeListEvents(events.getEvents());
    System.out.println(manager.getInfosAsString());



    }



    
}
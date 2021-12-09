package test;
import domain.entities.*;
import domain.agregate.*;
import domain.ManagerRooms;

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

    }



    
}
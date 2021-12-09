package test;
import domain.agregate.*;

public class RoomTest {
    public static void main(String[] args) {
        // test on Room agregate
        Room room = new Room("Parc des Princes de Cestas",400);        
        // test on attributes
        System.out.println("#### ROOM TESTS #####");
        System.out.println("Room capacity: " + room.getCapacity());
        System.out.println("Room name: " + room.getName());
        // test on capacity

    }
    
}

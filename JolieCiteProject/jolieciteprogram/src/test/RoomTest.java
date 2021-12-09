package test;
import domain.agregate.*;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class RoomTest {
    public static void main(String[] args) {
        // test on Room agregate
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar2 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar[] dates = new Calendar[]{calendar,calendar2};
        Room room = new Room("Parc des Princes de Cestas",400,dates);        
        // test on attributes
        System.out.println("#### ROOM TESTS #####");
        System.out.println("Room capacity: " + room.getCapacity());
        System.out.println("Room name: " + room.getName());
        room.availabilityToString();
        // test on capacity

    }
    
}

package domain.agregate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataBaseRooms {
    
    ArrayList<Room> rooms = new ArrayList<Room>();

    public DataBaseRooms() {
        this.rooms = loadDB();
    }

    public void displayDataBase(){
        for(Room room: this.rooms){
            System.out.println("Room name: " + room.getName());
            System.out.println("Room capacity: " + room.getCapacity());
            room.availabilityToString();
        }
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public ArrayList<Room> loadDB() {
        ArrayList<Room> rooms = new ArrayList<Room>();

        Calendar calendar1 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar2 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar3 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar4 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar5 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar6 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar7 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar8 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar9 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar10 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar11 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar12 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar13 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar14 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar15 = new GregorianCalendar(2013,1,28,13,24,00);
        Calendar calendar16 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar17 = new GregorianCalendar(2013,1,29,15,00,00);
        Calendar calendar18 = new GregorianCalendar(2013,1,29,15,00,00);
        
        Calendar[] dates1 = new Calendar[]{calendar1,calendar2,calendar3,calendar4,calendar5,calendar6};
        Room room1 = new Room("Parc des Princes de Cestas",400,dates1); 

        Calendar[] dates2 = new Calendar[]{calendar7,calendar8,calendar9,calendar10,calendar11,calendar12};
        Room room2 = new Room("L'olympia de Bourg sur Gironde",300,dates2); 

        Calendar[] dates3 = new Calendar[]{calendar13,calendar14,calendar15,calendar16,calendar17,calendar18};
        Room room3 = new Room("L'olympia de Bourg sur Gironde",300,dates3); 

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        
        return rooms;
    }
}

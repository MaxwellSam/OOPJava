package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Arrays;
import domain.agregate.Room;
import domain.entities.Event;

public class ManagerRooms {

    // Class Variables
    HashMap<String, Room> rooms = new HashMap<>();
    
    // Class Constructor
    public ManagerRooms(){}

    // Creation Room methods
    public void createRoom(String name,int capacity, Calendar[] availability){
        rooms.put(name, new Room(name, capacity, availability));
    };

    public void addRooms(ArrayList<Room> rooms){
        for(Room room : rooms){
            this.rooms.put(room.getName(),room);
        }
    }

    public HashMap<String, Room> getRooms() {
        return this.rooms;
    }

    // Display Rooms
    public void displayRooms(){
        System.out.println(Arrays.asList(this.rooms));
    } 

    // Place Event in Rooms
    public boolean placeEvent(Event event){
        String keyRoomAvailable = "";
        int bestDelta = -1;
        for (Room room : rooms.values()){
            // select the best room for event
            if (room.checkAvalability(event.getDates()) && room.checkCapacity(event.getCapacity())){
                if (bestDelta < 0){
                    bestDelta = room.getCapacity()-event.getCapacity();
                    keyRoomAvailable = room.getName();
                } else {
                    if (bestDelta > room.getCapacity()-event.getCapacity()){
                        bestDelta = room.getCapacity()-event.getCapacity();
                        keyRoomAvailable = room.getName();
                    }
                }
            }
        }
        if (keyRoomAvailable == ""){
            // false returned if no one room is available for this dates
            return false;
        }
        this.rooms.get(keyRoomAvailable).placeEvent(event);
        return true;
    }
}

package domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import javax.swing.text.html.parser.Entity;

import domain.agregate.Room;
import domain.entities.Event;
import domain.valueobjects.Concert;
import domain.valueobjects.ShowInterface;
import domain.valueobjects.TheaterPlay;
import test.CalandarTest;

public class ManagerRooms {
    HashMap<String, Room> rooms = new HashMap<>();
    
    public ManagerRooms(){}

    // Creation Room methods
    public void createRoom(String name,int capacity, Calendar[] availability){
        rooms.put(name, new Room(name, capacity, availability));
    };


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

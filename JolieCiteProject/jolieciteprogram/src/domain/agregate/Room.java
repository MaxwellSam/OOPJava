package domain.agregate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import domain.entities.Event;

public class Room {
    private final int capacity;
    private HashMap<Calendar, Boolean> availability = new HashMap<Calendar, Boolean>();
    private ArrayList<Event> events = new ArrayList<Event>(); 

    public Room(int cap){
        this.capacity = cap; 
    }

    public void placeEvent(Calendar date){
        //1) Check date availability 
        //2) Place Event
    }
}

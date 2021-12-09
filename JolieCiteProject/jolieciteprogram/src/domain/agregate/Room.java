package domain.agregate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

import domain.entities.Event;

public class Room {

    // Class Variables
    private String name;
    private final int capacity;
    private HashMap<Calendar, Boolean> availability = new HashMap<Calendar, Boolean>();
    private ArrayList<Event> events = new ArrayList<Event>(); 

    // Class Constructors
    public Room(String name, int cap){
        this.name = name;
        this.capacity = cap; 
    }

    // Class Methods
    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void placeEvent(Calendar date){
        //1) Check date availability 
        //2) Place Event
    }
}

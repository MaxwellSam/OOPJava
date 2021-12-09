package domain.agregate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map.Entry;

import domain.entities.Event;

public class Room {

    // Class Variables
    private String name;
    private final int capacity;
    private HashMap<Calendar, Boolean> availability = new HashMap<Calendar, Boolean>();
    private ArrayList<Event> events = new ArrayList<Event>(); 

    // Class Constructors
    public Room(String name, int cap, Calendar[] dates){
        this.name = name;
        this.capacity = cap; 
        for (Calendar date : dates){
            this.availability.put(date, true);
        } 
    }

    // Class Methods
    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public HashMap<Calendar, Boolean> getAvailability(){
        return this.availability;
    }

    public void availabilityToString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        for(Entry<Calendar, Boolean> entry : this.availability.entrySet()){

            Calendar calendar = entry.getKey();
            Boolean availability = entry.getValue();
            System.out.println(sdf.format(calendar.getTime()) + " " + availability);

        }
        
    }

    public void placeEvent(Event event){
        //1) Check date availability 
        //2) Place Event
    }
}

package domain.agregate;

import java.sql.Array;
import java.util.HashMap;

public class Room {
    private final Capacity capacity;
    private HashMap<Date, Hourly> opening;
    private Event[] events;

    public Room(int cap, HashMap<Date, Hourly> op){
        this.capacity = new Capacity(cap);
        this.opening = op;
        this.events = new 
    }
}

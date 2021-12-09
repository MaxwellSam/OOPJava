package domain.agregate;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
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

    public String getInfosAsString(){
        String txt = "";
        txt+="# Room: "+this.name+"\tCapacity : "+this.capacity+"\n";
        txt+="## Program\n";
        for (String line : availabilityToString()){
            txt+="- "+line+"\n";
        }
        return txt;
    }



        // Placing an event Methods

    public boolean checkCapacity(int capacityNeeded){
        return this.capacity >= capacityNeeded; 
    }
    public boolean checkAvalability(ArrayList<Calendar> dates){
        for (Calendar dateAsked : dates){
            if (!this.availability.containsKey(dateAsked) || !this.availability.get(dateAsked)){
                return false;
            }
        }
        return true;
    }   

    public void placeEvent(Event event){
        for (Calendar date : event.getDates()){
            this.availability.replace(date, false);
        }
        this.events.add(event);
    }

    public ArrayList<String> availabilityToString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
        ArrayList<String> arrAvalStr = new ArrayList<>();
        for(Entry<Calendar, Boolean> entry : this.availability.entrySet()){
            if (entry.getValue()){
                arrAvalStr.add(""+sdf.format(entry.getKey().getTime())+ " --> Available");
            } else {
                String nameEvent = "";
                for (Event event : events){
                    if (event.getDates().contains(entry.getKey())){
                        nameEvent = event.getShow().getName();
                    }
                }
                arrAvalStr.add(""+sdf.format(entry.getKey().getTime())+ " --> Occuped : "+nameEvent);
            }

        }
        return arrAvalStr;
    }

}

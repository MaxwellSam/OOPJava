package domain.entities;
import java.util.ArrayList;
import java.util.Calendar;

import domain.valueobjects.ShowInterface;

public class Event {
    int capacity;
    ShowInterface show;

    public Event(int capacity, ShowInterface show){
        this.capacity = capacity;
        this.show = show;
    }

    public int getCapacity(){
        return capacity;
    }

    public ShowInterface getShow(){
        return show;
    }

    public ArrayList<Calendar> getDates(){
        return this.show.getDate();
    }
}


